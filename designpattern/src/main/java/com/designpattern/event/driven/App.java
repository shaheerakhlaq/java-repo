package com.designpattern.event.driven;

import com.designpattern.event.driven.event.UserCreatedEvent;
import com.designpattern.event.driven.event.UserUpdatedEvent;
import com.designpattern.event.driven.framework.EventDispatcher;
import com.designpattern.event.driven.handler.UserCreatedEventHandler;
import com.designpattern.event.driven.handler.UserUpdatedEventHandler;
import com.designpattern.event.driven.model.User;

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