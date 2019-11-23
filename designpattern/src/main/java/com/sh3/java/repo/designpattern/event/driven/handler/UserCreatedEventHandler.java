package com.sh3.java.repo.designpattern.event.driven.handler;

import com.sh3.java.repo.designpattern.event.driven.event.UserCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sh3.java.repo.designpattern.event.driven.framework.Handler;

/**
 * @author MSA
 * @version 1.0
 */

public class UserCreatedEventHandler implements Handler<UserCreatedEvent> {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserCreatedEventHandler.class);
	
	public void onEvent(UserCreatedEvent event) {
		LOGGER.info("User '{}' has been Created!", event.getUser().getUsername());
	}
}