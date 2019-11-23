package com.designpattern.event.driven.framework;

/**
 * @author MSA
 * @version 1.0
 */

public interface Event {
	Class<? extends Event> getType();
}