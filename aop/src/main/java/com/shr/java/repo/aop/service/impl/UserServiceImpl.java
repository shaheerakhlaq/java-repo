package com.shr.java.repo.aop.service.impl;

import com.shr.java.repo.aop.auditlog.annotation.Logging;
import com.shr.java.repo.aop.model.User;
import com.shr.java.repo.aop.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MSA
 * @version 1.0
 */

@Service
public class UserServiceImpl implements UserService {
    public static Map<String, User> mapList = new HashMap<String, User>();

    @Logging
    public void saveUser(User user) {
        mapList.put(user.getUsername(), user);
    }

    @Logging
    public User findUser(String name, int age) {
        User user = (User) mapList.get(name);
        return user;
    }

    @Logging
    public User findByUsername(String username) {
        return (User) mapList.get(username);
    }
}