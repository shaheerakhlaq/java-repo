package com.sh3.java.repo.designpattern.servicelocator;

public class Service2 implements Service {
	public void execute() {
		System.out.println("Executing Service2");
	}

	public String getName() {
		return "Service2";
	}
}