package com.sh3.java.repo.designpattern.nullobject;

public class NullCustomer extends AbstractCustomer {
	public String getName() {
		return "Not Available in Customer Database";
	}

	public boolean isNil() {
		return true;
	}
}