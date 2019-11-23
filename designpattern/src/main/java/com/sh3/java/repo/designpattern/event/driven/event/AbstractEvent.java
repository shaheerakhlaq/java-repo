package com.sh3.java.repo.designpattern.event.driven.event;

import com.sh3.java.repo.designpattern.event.driven.framework.Event;

/**
 * @author MSA
 * @version 1.0
 */

public abstract class AbstractEvent implements Event {
	public Class<? extends Event> getType() {
		return getClass();
	}
}