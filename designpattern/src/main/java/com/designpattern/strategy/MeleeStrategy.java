package com.designpattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MSA
 */

public class MeleeStrategy implements DragonSlayingStrategy {
	private static final Logger logger = LoggerFactory.getLogger(MeleeStrategy.class);

	public void execute() {
		logger.info("With your Excalibur you sever the dragon's head!");
	}
}