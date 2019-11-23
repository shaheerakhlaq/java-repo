package com.sh3.java.repo.designpattern.singleton.v2;

public enum EnumIvoryTower {
	INSTANCE;
	
	public String toString() {
		return getDeclaringClass().getCanonicalName() + "@" + hashCode();
	}
}
