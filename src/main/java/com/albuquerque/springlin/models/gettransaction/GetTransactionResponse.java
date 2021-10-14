package com.albuquerque.springlin.models.gettransaction;

public class GetTransactionResponse {

	private FxEncapsulator fx;
	private TransactionEncapsulator transaction;
	private CustomerInfo customerInfo;
	private Merchant merchant;

	public GetTransactionResponse() {
	}

	public GetTransactionResponse(FxEncapsulator fx, TransactionEncapsulator transaction, CustomerInfo customerInfo,
			Merchant merchant) {
		super();
		this.fx = fx;
		this.transaction = transaction;
		this.customerInfo = customerInfo;
		this.merchant = merchant;
	}

	public FxEncapsulator getFx() {
		return fx;
	}

	public void setFx(FxEncapsulator fx) {
		this.fx = fx;
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
