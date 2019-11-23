package com.designpattern.singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		/*SingleObject object = SingleObject.getInstance();
		object.showMessage();
		object.showMessage();*/
		
		ThreadSafeDoubleCheckLocking dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
		System.out.println(dcl1.toString());
		ThreadSafeDoubleCheckLocking dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
		System.out.println(dcl2.toString());
	}
}