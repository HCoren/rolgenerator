package com.rolgenerator.config.security.filters.xss;

import java.lang.ref.SoftReference;

// TODO: Auto-generated Javadoc
/**
 * The Class CacheableObject.
 *
 * @param <OBJECT> the generic type
 */
public abstract class CacheableObject<OBJECT> {

	/** The thread cache. */
	private ThreadLocal<SoftReference<OBJECT>> threadCache = new ThreadLocal<SoftReference<OBJECT>>();

	/**
	 * Gets the cached object.
	 *
	 * @return the cached object
	 */
	protected OBJECT getCachedObject() {
		OBJECT s = null;
		SoftReference<OBJECT> mRef = threadCache.get();
		if (mRef == null) {
			s = null;
		} else {
			s = mRef.get();
		}
		if (s == null) {
			s = build();
			threadCache.set(new SoftReference<OBJECT>(s));
		}

		return s;
	}

	/**
	 * Builds the.
	 *
	 * @return the object
	 */
	protected abstract OBJECT build();

}
