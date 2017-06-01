package com.rolgenerator.config.security.filters.xss;

// TODO: Auto-generated Javadoc
/**
 * The Class CachedStripper.
 */
public class CachedStripper extends CacheableObject<Stripper> {

	/**
	 * Strip XSS.
	 *
	 * @param value the paameter
	 * @return the encoded value
	 */
	public String stripXSS(String value) {
		return getCachedObject().stripXSS(value);
	}

	/* (non-Javadoc)
	 * @see com.rolgenerator.config.security.filters.xss.CacheableObject#build()
	 */
	@Override
	protected Stripper build() {
		return new Stripper();
	}
}
