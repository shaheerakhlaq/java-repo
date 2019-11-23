package com.sh3.java.repo.designpattern.dependency.injection;

import com.google.inject.AbstractModule;

public class TobaccoModule extends AbstractModule {
	protected void configure() {
		bind(Tobacco.class).to(RivendellTobacco.class);
	}
}