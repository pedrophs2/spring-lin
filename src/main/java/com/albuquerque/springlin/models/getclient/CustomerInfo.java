package com.albuquerque.springlin.models.getclient;

public class CustomerInfo {

	private String billingFirstName;
	private String billingLastName;
	private String issueNumber;
	private String email;
	private String billingCompany;
	private String billingCity;
	private String updated_at;
	private String created_at;
	private Integer id;

	public CustomerInfo() {
	}

	public CustomerInfo(String billingFirstName, String billingLastName, String issueNumber, String email,
			String billingCompany, String billingCity, String updated_at, String created_at, Integer id) {
		super();
		this.billingFirstName = billingFirstName;
		this.billingLastName = billingLastName;
		this.issueNumber = issueNumber;
		this.email = email;
		this.billingCompany = billingCompany;
		this.billingCity = billingCity;
		this.updated_at = updated_at;
		this.created_at = created_at;
		this.id = id;
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

	public String getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBillingCompany() {
		return billingCompany;
	}

	public void setBillingCompany(String billingCompany) {
		this.billingCompany = billingCompany;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
