package com.sh3.java.repo.designpattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MSA
 */

public class ProjectileStrategy implements DragonSlayingStrategy {
	private static final Logger logger = LoggerFactory.getLogger(ProjectileStrategy.class);
	
	public void execute() {
		logger.info("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
	}
}