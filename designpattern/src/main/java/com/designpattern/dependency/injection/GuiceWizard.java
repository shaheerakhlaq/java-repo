package com.designpattern.dependency.injection;

import javax.inject.Inject;

public class GuiceWizard implements Wizard {
	private Tobacco tobacco;

	@Inject
	public GuiceWizard(Tobacco tobacco) {
		this.tobacco = tobacco;
	}
	
	public void smoke() {
		tobacco.smoke(this);
	}
}