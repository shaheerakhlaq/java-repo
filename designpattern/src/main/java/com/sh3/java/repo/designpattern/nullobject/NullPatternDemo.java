package com.sh3.java.repo.designpattern.nullobject;

public class NullPatternDemo {
	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Ahsan");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Saad");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Asad");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Shaheer");

		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}