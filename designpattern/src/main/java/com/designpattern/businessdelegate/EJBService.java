package com.designpattern.businessdelegate;

/**
 * @author MSA
 */

public class EJBService implements BusinessService {
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}
}