package com.albuquerque.springlin.models.getclient;

public class GetClientResponse {

	private Object customerInfo;

	public GetClientResponse() {
	}

	public GetClientResponse(Object customerInfo) {
		super();
		this.customerInfo = customerInfo;
	}

	public Object getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(Object customerInfo) {
		this.customerInfo = customerInfo;
	}

}
