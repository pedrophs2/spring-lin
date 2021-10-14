package com.albuquerque.springlin.models.listtransactions;

public class FxInformation {

	private Integer originalAmount;
	private String originalCurrency;
	private Integer convertedAmount;
	private String convertedCurrency;

	public FxInformation() {
	}

	public FxInformation(Integer originalAmount, String originalCurrency, Integer convertedAmount,
			String convertedCurrency) {
		super();
		this.originalAmount = originalAmount;
		this.originalCurrency = originalCurrency;
		this.convertedAmount = convertedAmount;
		this.convertedCurrency = convertedCurrency;
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

	public Integer getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(Integer convertedAmount) {
		this.convertedAmount = convertedAmount;
	}

	public String getConvertedCurrency() {
		return convertedCurrency;
	}

	public void setConvertedCurrency(String convertedCurrency) {
		this.convertedCurrency = convertedCurrency;
	}

}
