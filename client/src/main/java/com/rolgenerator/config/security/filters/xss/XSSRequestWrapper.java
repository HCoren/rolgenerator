package com.rolgenerator.config.security.filters.xss;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class XSSRequestWrapper.
 */
public class XSSRequestWrapper extends HttpServletRequestWrapper {

	/** The Constant logger. */
	protected static final Logger logger = LoggerFactory.getLogger(XSSRequestWrapper.class);
	
	/** The encoded values. */
	private Map<String, String[]> encodedValues = null;
	
	/** The Constant STRIPPER. */
	private static final CachedStripper STRIPPER = new CachedStripper();

	/**
	 * Instantiates a new XSS request wrapper.
	 *
	 * @param servletRequest the servlet request
	 */
	public XSSRequestWrapper(HttpServletRequest servletRequest) {
		super(servletRequest);
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.ServletRequestWrapper#getParameterValues(java.lang.String)
	 */
	@Override
	public String[] getParameterValues(String parameter) {
		String[] values = super.getParameterValues(parameter);

		if (values == null) {
			return null;
		}
		
		fillEncodedValues();
		return encodedValues.get(parameter);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletRequestWrapper#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String parameter) {
		String value = super.getParameter(parameter);
		
		if (value == null) {
			return null;
		}
		
		fillEncodedValues();
		return encodedValues.get(parameter)[0];
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletRequestWrapper#getParameterMap()
	 */
	@Override
	public Map<String, String[]> getParameterMap() {
		fillEncodedValues();
		return encodedValues;
	}
	
	/**
	 * Fill encoded values.
	 */
	private void fillEncodedValues() {
		if (encodedValues != null) {
			return;
		} 
		
		encodedValues = new HashMap<String, String[]>();
		Map<String, String[]> values = super.getParameterMap();
		
		for (Map.Entry<String, String[]> entry : values.entrySet()) {
			String[] valuesArray = entry.getValue();
			if (valuesArray != null) {
				String[] encodedValuesArray = new String[valuesArray.length];
				for (int i = 0; i < valuesArray.length; i++) {
					encodedValuesArray[i] = stripXSS(valuesArray[i]);
				}
				encodedValues.put(entry.getKey(), encodedValuesArray);
			}
		}
	}

	/**
	 * Strip XSS.
	 *
	 * @param value the parameter
	 * @return the encoded value
	 */
	private String stripXSS(String value) {
		String result = STRIPPER.stripXSS(value);
		return result;
	}
}