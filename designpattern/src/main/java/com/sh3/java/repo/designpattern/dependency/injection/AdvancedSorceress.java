package com.sh3.java.repo.designpattern.dependency.injection;

public class AdvancedSorceress implements Wizard {
	private Tobacco tobacco;

	public void setTobacco(Tobacco tobacco) {
		this.tobacco = tobacco;
	}

	public void smoke() {
		tobacco.smoke(this);
	}
}