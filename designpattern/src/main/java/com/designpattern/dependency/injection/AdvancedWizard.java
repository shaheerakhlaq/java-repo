package com.designpattern.dependency.injection;

public class AdvancedWizard implements Wizard {
	private Tobacco tobacco;

	public AdvancedWizard(Tobacco tobacco) {
		this.tobacco = tobacco;
	}

	public void smoke() {
		tobacco.smoke(this);
	}
}