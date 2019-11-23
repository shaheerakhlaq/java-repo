package com.sh3.java.repo.designpattern.servicelocator;

public class Service1 implements Service {
	public void execute() {
		System.out.println("Executing Service1");
	}
	
	public String getName() {
		return "Service1";
	}
}