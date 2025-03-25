package com.shr.java.repo.aop.main;

import com.shr.java.repo.aop.model.User;
import com.shr.java.repo.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MSA
 * @version 1.0
 */

public final class Main {
	public static void main(final String[] args) throws Exception {
		//BeanFactory ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ctx.getBean(UserService.class);
		
		User user = new User(1, "sharaheel", "sharaheel", "Sharaheel", 1);
		
		userService.saveUser(user);
		userService.findUser(user.getName(), user.getAge());
		userService.findByUsername(user.getUsername());
	}
}