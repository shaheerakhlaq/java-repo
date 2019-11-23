package com.sh3.java.repo.designpattern.event.driven.handler;

import com.sh3.java.repo.designpattern.event.driven.event.UserUpdatedEvent;
import com.sh3.java.repo.designpattern.event.driven.framework.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MSA
 * @version 1.0
 */

public class UserUpdatedEventHandler implements Handler<UserUpdatedEvent> {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserUpdatedEventHandler.class);

	public void onEvent(UserUpdatedEvent event) {
		LOGGER.info("User '{}' has been Updated!", event.getUser().getUsername());
	}
}