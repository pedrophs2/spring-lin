package com.albuquerque.springlin.models.listtransactions;

public class TransactionEncapsulator {

	private Transaction merchant;

	public TransactionEncapsulator() {
	}

	public TransactionEncapsulator(Transaction merchant) {
		super();
		this.merchant = merchant;
	}

	public Transaction getMerchant() {
		return merchant;
	}

	public void setMerchant(Transaction merchant) {
		this.merchant = merchant;
	}

}
