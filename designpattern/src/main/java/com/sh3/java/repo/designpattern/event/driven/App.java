package com.sh3.java.repo.designpattern.event.driven;

import com.sh3.java.repo.designpattern.event.driven.event.UserCreatedEvent;
import com.sh3.java.repo.designpattern.event.driven.event.UserUpdatedEvent;
import com.sh3.java.repo.designpattern.event.driven.framework.EventDispatcher;
import com.sh3.java.repo.designpattern.event.driven.handler.UserCreatedEventHandler;
import com.sh3.java.repo.designpattern.event.driven.handler.UserUpdatedEventHandler;
import com.sh3.java.repo.designpattern.event.driven.model.User;

/**
 * @author MSA
 * @version 1.0
 */

public class App {
	public static void main(String[] args) {
		EventDispatcher dispatcher = new EventDispatcher();
		dispatcher.registerHandler(UserCreatedEvent.class, new UserCreatedEventHandler());
		dispatcher.registerHandler(UserUpdatedEvent.class, new UserUpdatedEventHandler());

		User user = new User("Shaheer");
		dispatcher.dispatch(new UserCreatedEvent(user));
		dispatcher.dispatch(new UserUpdatedEvent(user));
	}
}