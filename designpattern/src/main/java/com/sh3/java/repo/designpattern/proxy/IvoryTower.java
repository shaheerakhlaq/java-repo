package com.sh3.java.repo.designpattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IvoryTower implements WizardTower {
	private static final Logger LOGGER = LoggerFactory.getLogger(IvoryTower.class);

	public void enter(Wizard wizard) {
		LOGGER.info("{} enters the tower.", wizard);
	}
}