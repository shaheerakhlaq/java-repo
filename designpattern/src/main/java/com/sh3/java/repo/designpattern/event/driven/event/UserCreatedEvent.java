package com.sh3.java.repo.designpattern.event.driven.event;

import com.sh3.java.repo.designpattern.event.driven.model.User;

/**
 * @author MSA
 * @version 1.0
 */

public class UserCreatedEvent extends AbstractEvent {
	private User user;

	public UserCreatedEvent(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}