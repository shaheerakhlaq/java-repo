package com.designpattern.nullobject;

public class RealCustomer extends AbstractCustomer {
	public RealCustomer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean isNil() {
		return false;
	}
}