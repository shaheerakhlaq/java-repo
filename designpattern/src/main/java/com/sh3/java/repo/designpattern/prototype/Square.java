package com.sh3.java.repo.designpattern.prototype;

public class Square extends Shape {
	public Square() {
		type = "Square";
	}
	
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}