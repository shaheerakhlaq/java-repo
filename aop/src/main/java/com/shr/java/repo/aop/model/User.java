package com.shr.java.repo.aop.model;

import java.io.Serializable;

/**
 * @author MSA
 * @version 1.0
 */

public class User implements Serializable {
    private long userId;
    private String username;
    private String password;
    private String name;
    private int age;

    public User(long userId, String username, String password, String name, int age) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}