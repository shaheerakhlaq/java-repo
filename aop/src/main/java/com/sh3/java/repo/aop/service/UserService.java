package com.sh3.java.repo.aop.service;

import com.sh3.java.repo.aop.model.User;

/**
 * @author MSA
 * @version 1.0
 */

public interface UserService {
	void saveUser(User user);
	
	User findUser(String name, int age);
	
	User findByUsername(String username);
}