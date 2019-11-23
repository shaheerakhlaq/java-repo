package com.sh3.java.repo.designpattern.event.driven.framework;

/**
 * @author MSA
 * @version 1.0
 */

public interface Handler<E extends Event> {
	void onEvent(E event);
}