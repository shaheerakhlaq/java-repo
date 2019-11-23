package com.designpattern.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MSA
 */

public class HitAndRunMethod extends StealingMethod {
	private static final Logger logger = LoggerFactory.getLogger(HitAndRunMethod.class);

	protected String pickTarget() {
		return "old goblin woman";
	}

	protected void confuseTarget(String target) {
		logger.info("Approach the {} from behind.", target);
	}

	protected void stealTheItem(String target) {
		logger.info("Grab the handbag and run away fast!");
	}
}