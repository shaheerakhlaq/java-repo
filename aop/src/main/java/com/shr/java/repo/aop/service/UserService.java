package com.shr.java.repo.aop.service;

import com.shr.java.repo.aop.model.User;

/**
 * @author MSA
 * @version 1.0
 */

public interface UserService {
	void saveUser(User user);
	
	User findUser(String name, int age);
	
	User findByUsername(String username);
}