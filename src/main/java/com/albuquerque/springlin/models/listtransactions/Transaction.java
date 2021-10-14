package com.albuquerque.springlin.models.listtransactions;

public class Transaction {

	private String referenceNo;
	private String status;
	private String customData;
	private String type;
	private String operation;
	private String created_at;
	private String message;
	private String transactionId;

	public Transaction() {
	}

	public Transaction(String referenceNo, String status, String customData, String type, String operation,
			String created_at, String message, String transactionId) {
		super();
		this.referenceNo = referenceNo;
		this.status = status;
		this.customData = customData;
		this.type = type;
		this.operation = operation;
		this.created_at = created_at;
		this.message = message;
		this.transactionId = transactionId;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCustomData() {
		return customData;
	}

	public void setCustomData(String customData) {
		this.customData = customData;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
