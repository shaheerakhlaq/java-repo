package com.designpattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MSA
 */

public class SpellStrategy implements DragonSlayingStrategy {
	private static final Logger logger = LoggerFactory.getLogger(SpellStrategy.class);
	
	public void execute() {
		logger.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
	}
}