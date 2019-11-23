package com.designpattern.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdasApp {
	private static final Logger LOGGER = LoggerFactory.getLogger(LambdasApp.class);
	
	public static void main(String[] args) {
		Task task = new SimpleTask();
		Callback c = () -> LOGGER.info("I'm done now.");
		task.executeWith(c);
	}
}