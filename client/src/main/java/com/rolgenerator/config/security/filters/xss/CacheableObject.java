package com.rolgenerator.config.security.filters.xss;

import java.lang.ref.SoftReference;

public abstract class CacheableObject<OBJECT> {

	private ThreadLocal<SoftReference<OBJECT>> threadCache = new ThreadLocal<SoftReference<OBJECT>>();

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

	protected abstract OBJECT build();

}
