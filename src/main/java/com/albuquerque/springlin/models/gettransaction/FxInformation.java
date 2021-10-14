package com.albuquerque.springlin.models.gettransaction;

public class FxInformation {

	private Integer originalAmount;
	private String originalCurrency;

	public FxInformation() {
	}

	public FxInformation(Integer originalAmount, String originalCurrency) {
		super();
		this.originalAmount = originalAmount;
		this.originalCurrency = originalCurrency;
	}

	public Integer getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(Integer originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getOriginalCurrency() {
		return originalCurrency;
	}

	public void setOriginalCurrency(String originalCurrency) {
		this.originalCurrency = originalCurrency;
	}

}
