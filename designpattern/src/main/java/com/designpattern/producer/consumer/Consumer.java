package com.designpattern.producer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consumer {
	private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

	private final ItemQueue queue;
	private final String name;

	public Consumer(String name, ItemQueue queue) {
		this.name = name;
		this.queue = queue;
	}
	
	public void consume() throws InterruptedException {
		Item item = queue.take();
		
		LOGGER.info("Consumer [{}] consume item [{}] produced by [{}]", name, item.getId(), item.getProducer());
	}
}