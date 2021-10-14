package com.albuquerque.springlin.models.listtransactions;

public class CustomerInfo {

	private String billingFirstName;
	private String billingLastName;
	private String email;

	public CustomerInfo() {
	}

	public CustomerInfo(String billingFirstName, String billingLastName, String email) {
		super();
		this.billingFirstName = billingFirstName;
		this.billingLastName = billingLastName;
		this.email = email;
	}

	public String getBillingFirstName() {
		return billingFirstName;
	}

	public void setBillingFirstName(String billingFirstName) {
		this.billingFirstName = billingFirstName;
	}

	public String getBillingLastName() {
		return billingLastName;
	}

	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
