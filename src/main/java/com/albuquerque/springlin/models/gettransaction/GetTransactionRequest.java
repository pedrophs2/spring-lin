package com.albuquerque.springlin.models.gettransaction;

public class GetTransactionRequest {

	private String transactionId;

	public GetTransactionRequest() {
	}

	public GetTransactionRequest(String transactionId) {
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
