package com.sh3.java.repo.designpattern.businessdelegate;

/**
 * @author MSA
 */

public class BusinessDelegate {
	private BusinessLookUp lookupService = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}