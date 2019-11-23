package com.sh3.java.repo.designpattern.singleton.v2;

public final class IvoryTower {
	private IvoryTower() {
	}

	private static final IvoryTower INSTANCE = new IvoryTower();

	public static IvoryTower getInstance() {
		return INSTANCE;
	}
}