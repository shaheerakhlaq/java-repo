package com.designpattern.singleton.v2;

public final class ThreadSafeDoubleCheckLocking {
	private static volatile ThreadSafeDoubleCheckLocking instance;

	private ThreadSafeDoubleCheckLocking() {
		if (instance != null) {
			throw new IllegalStateException("Already initialized.");
		}
	}

	public static ThreadSafeDoubleCheckLocking getInstance() {
		ThreadSafeDoubleCheckLocking result = instance;

		if (result == null) {
			synchronized (ThreadSafeDoubleCheckLocking.class) {
				result = instance;
				if (result == null) {
					instance = result = new ThreadSafeDoubleCheckLocking();
				}
			}
		}
		return result;
	}
}