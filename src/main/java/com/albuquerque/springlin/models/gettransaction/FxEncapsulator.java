package com.albuquerque.springlin.models.gettransaction;

public class FxEncapsulator {

	private FxInformation merchant;

	public FxEncapsulator() {
	}

	public FxEncapsulator(FxInformation merchant) {
		super();
		this.merchant = merchant;
	}

	public FxInformation getMerchant() {
		return merchant;
	}

	public void setMerchant(FxInformation merchant) {
		this.merchant = merchant;
	}

}
