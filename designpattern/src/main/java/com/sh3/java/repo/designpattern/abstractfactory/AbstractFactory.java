package com.sh3.java.repo.designpattern.abstractfactory;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}