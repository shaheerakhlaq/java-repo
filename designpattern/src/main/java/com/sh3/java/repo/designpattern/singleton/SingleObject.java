package com.sh3.java.repo.designpattern.singleton;

public class SingleObject {
	private static SingleObject instance = new SingleObject();

	private SingleObject() {
	}
	
	public static SingleObject getInstance() {
		System.out.println("instance: "+ instance);
		if (instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}