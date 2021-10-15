package com.albuquerque.springlin.models.getclient;

public class GetClientResponse {

	private CustomerInfo customerInfo;

	public GetClientResponse() {
	}

	public GetClientResponse(CustomerInfo customerInfo) {
		super();
		this.customerInfo = customerInfo;
	}

	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

}
