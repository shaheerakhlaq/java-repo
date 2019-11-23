package com.sh3.java.repo.designpattern.frontcontroller;

/**
 * @author MSA
 */

public class FrontControllerPatternDemo {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}