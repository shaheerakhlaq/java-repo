package com.sh3.java.repo.designpattern.proxy;

public class Wizard {
	private final String name;

	public Wizard(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}