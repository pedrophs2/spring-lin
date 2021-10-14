package com.albuquerque.springlin.models.getclient;

public class GetClientRequest {

	private String transactionId;

	public GetClientRequest() {
	}

	public GetClientRequest(String transactionId) {
		super();
		this.transactionId = transactionId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
