package com.designpattern.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MSA
 */

public class SubtleMethod extends StealingMethod {
	private static final Logger logger = LoggerFactory.getLogger(SubtleMethod.class);
	
	protected String pickTarget() {
		return "shop keeper";
	}

	protected void confuseTarget(String target) {
		logger.info("Approach the {} with tears running and hug him!", target);
	}

	protected void stealTheItem(String target) {
		logger.info("While in close contact grab the {}'s wallet.", target);
	}
}