package com.designpattern.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MSA
 */

public abstract class StealingMethod {
	private static final Logger logger = LoggerFactory.getLogger(StealingMethod.class);

	protected abstract String pickTarget();

	protected abstract void confuseTarget(String target);

	protected abstract void stealTheItem(String target);
	
	public void steal() {
		String target = pickTarget();
		
		logger.info("The target has been chosen as {}.", target);
		
		confuseTarget(target);
		stealTheItem(target);
	}
}