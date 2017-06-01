package com.rolgenerator.config.security.filters.xss;

public class CachedStripper extends CacheableObject<Stripper> {

	public String stripXSS(String value) {
		return getCachedObject().stripXSS(value);
	}

	@Override
	protected Stripper build() {
		return new Stripper();
	}
}
