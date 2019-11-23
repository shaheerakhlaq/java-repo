package com.designpattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MSA
 */

public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		/*logger.info("Green dragon spotted ahead!");
		DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
		dragonSlayer.goToBattle();
		
		logger.info("Red dragon emerges.");
		dragonSlayer.changeStrategy(new ProjectileStrategy());
		dragonSlayer.goToBattle();
		
		logger.info("Black dragon lands before you.");
		dragonSlayer.changeStrategy(new SpellStrategy());
		dragonSlayer.goToBattle();*/
		
		DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
		
		logger.info("Green dragon spotted ahead!");
		dragonSlayer = new DragonSlayer(() -> logger.info("1"));
		dragonSlayer.goToBattle();
		
		logger.info("Red dragon emerges.");
		dragonSlayer.changeStrategy(() -> logger.info("2"));
		dragonSlayer.goToBattle();
		
		logger.info("Black dragon lands before you.");
		dragonSlayer.changeStrategy(() -> logger.info("3"));
		dragonSlayer.goToBattle();
	}
}