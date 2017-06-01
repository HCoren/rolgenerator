package com.rolgenerator.config.security.filters.xss;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class Stripper.
 */
public class Stripper {

	/** The Constant logger. */
	protected static final Logger logger = LoggerFactory.getLogger(Stripper.class);
	
	/** The matchers. */
	private final List<Matcher> matchers = new ArrayList<Matcher>();

	/** The Constant PATTERNS. */
	private static final Pattern[] PATTERNS = new Pattern[] {
			// Null characters
			Pattern.compile("\u0000", Pattern.MULTILINE), //
			// DOM events
	        Pattern.compile("(onclick|oncontextmenu|ondblclick|onmousedown|onmouseenter|onmouseleave|onmousemove|"
	        		+ "onmouseover|onmouseout|onmouseup|"
	        		+ "onkeydown|onkeypress|onkeyup|"
	        		+ "onabort|onbeforeunload|onerror|onhashchange|onload|onpageshow|onpagehide|onresize|onscroll|onunload|"
	        		+ "onblur|onchange|onfocus|onfocusin|onfocusout|oninput|oninvalid|onreset|onsearch|onselect|onsubmit|"
	        		+ "ondrag|ondragend|ondragenter|ondragleace|ondragover|ondragstart|ondrop|"
	        		+ "oncopy|oncut|onpaste|"
	        		+ "onafterprint|onbeforeprint|"
	        		+ "onabort|oncanplay|oncanplaythrough|ondurationchange|onemptied|onended|onloadeddata|onloadedmetadata|"
	        		+ "onloadstart|onpause|onplay|onplaying|onprogress|onratechange|onseeked|onseeking|onstalled|onsuspend|"
	        		+ "ontimeupdate|onvolumechange|onwaiting)[^=]*=", 
	        		Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL), //
			// Script fragments
	        Pattern.compile("<\\s*script[^>]*>(.*?)<\\\\s*script[^>]*>", Pattern.CASE_INSENSITIVE| Pattern.MULTILINE | Pattern.DOTALL),
	        // src='...'
	        Pattern.compile("src[^=]*=\\s*\\\'(.*)\\\'", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
	        Pattern.compile("src[^=]*=\\s*\\\"(.*)\\\"", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
	        // eval(...)
	        Pattern.compile("eval\\((.*?)\\)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
	        // expression(...)
	        Pattern.compile("expression\\((.*?)\\)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
	        // javascript:...
	        Pattern.compile("javascript:", Pattern.CASE_INSENSITIVE),
	        // vbscript:...
	        Pattern.compile("vbscript:", Pattern.CASE_INSENSITIVE),
	};

	/**
	 * Instantiates a new stripper.
	 */
	public Stripper() {
		for (Pattern scriptPattern : PATTERNS) {
			this.matchers.add(scriptPattern.matcher(""));
		}
	}

	/**
	 * Strip XSS.
	 *
	 * @param value the parameter
	 * @return the encoded value
	 */
	public String stripXSS(String value) {
		if (value != null) {
			for (Matcher scriptMatcher : matchers) {
				value = scriptMatcher.reset(value).replaceAll("");
			}
		}
		return value;
	}
}
