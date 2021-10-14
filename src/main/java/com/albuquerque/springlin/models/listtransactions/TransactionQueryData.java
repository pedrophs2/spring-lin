package com.albuquerque.springlin.models.listtransactions;

public class TransactionQueryData {

	private String updated_at;
	private String created_at;
	private Boolean refundable;
	private FxEncapsulator fx;
	private Acquirer acquirer;
	private TransactionEncapsulator transaction;
	private CustomerInfo customerInfo;
	private Merchant merchant;

	public TransactionQueryData() {
	}

	public TransactionQueryData(String updated_at, String created_at, Boolean refundable, FxEncapsulator fx,
			Acquirer acquirer, TransactionEncapsulator transaction, CustomerInfo customerInfo, Merchant merchant) {
		super();
		this.updated_at = updated_at;
		this.created_at = created_at;
		this.refundable = refundable;
		this.fx = fx;
		this.acquirer = acquirer;
		this.transaction = transaction;
		this.customerInfo = customerInfo;
		this.merchant = merchant;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public Boolean getRefundable() {
		return refundable;
	}

	public void setRefundable(Boolean refundable) {
		this.refundable = refundable;
	}

	public FxEncapsulator getFx() {
		return fx;
	}

	public void setFx(FxEncapsulator fx) {
		this.fx = fx;
	}

	public Acquirer getAcquirer() {
		return acquirer;
	}

	public void setAcquirer(Acquirer acquirer) {
		this.acquirer = acquirer;
	}

	public TransactionEncapsulator getTransaction() {
		return transaction;
	}

	public void setTransaction(TransactionEncapsulator transaction) {
		this.transaction = transaction;
	}

	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

}
