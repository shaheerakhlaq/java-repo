package com.sh3.java.repo.designpattern.businessdelegate;

/**
 * @author MSA
 */

public class JMSService implements BusinessService {
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}
}