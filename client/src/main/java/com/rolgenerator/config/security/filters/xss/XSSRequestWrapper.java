package com.rolgenerator.config.security.filters.xss;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XSSRequestWrapper extends HttpServletRequestWrapper {

	protected static final Logger logger = LoggerFactory.getLogger(XSSRequestWrapper.class);

	private Map<String, String[]> encodedValues = null;

	private static final CachedStripper STRIPPER = new CachedStripper();

	public XSSRequestWrapper(HttpServletRequest servletRequest) {
		super(servletRequest);
	}

	@Override
	public String[] getParameterValues(String parameter) {
		String[] values = super.getParameterValues(parameter);

		if (values == null) {
			return null;
		}
		
		fillEncodedValues();
		return encodedValues.get(parameter);
	}

	@Override
	public String getParameter(String parameter) {
		String value = super.getParameter(parameter);
		
		if (value == null) {
			return null;
		}
		
		fillEncodedValues();
		return encodedValues.get(parameter)[0];
	}

	@Override
	public Map<String, String[]> getParameterMap() {
		fillEncodedValues();
		return encodedValues;
	}
	
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

	private String stripXSS(String value) {
		String result = STRIPPER.stripXSS(value);
		return result;
	}
}