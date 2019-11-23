package com.designpattern.producer.consumer;

public class Item {
	private String producer;
	private int id;

	public Item(String producer, int id) {
		this.id = id;
		this.producer = producer;
	}

	public int getId() {
		return id;
	}

	public String getProducer() {
		return producer;
	}
}