package com.albuquerque.springlin.models.gettransaction;

public class Agent {

	private Integer id;
	private String customerIp;
	private String customerUserAgent;
	private String merchantIp;
	private String merchantUserAgent;
	private String created_at;
	private String updated_at;
	private String deleted_at;

	public Agent() {
	}

	public Agent(Integer id, String customerIp, String customerUserAgent, String merchantIp, String merchantUserAgent,
			String created_at, String updated_at, String deleted_at) {
		super();
		this.id = id;
		this.customerIp = customerIp;
		this.customerUserAgent = customerUserAgent;
		this.merchantIp = merchantIp;
		this.merchantUserAgent = merchantUserAgent;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerIp() {
		return customerIp;
	}

	public void setCustomerIp(String customerIp) {
		this.customerIp = customerIp;
	}

	public String getCustomerUserAgent() {
		return customerUserAgent;
	}

	public void setCustomerUserAgent(String customerUserAgent) {
		this.customerUserAgent = customerUserAgent;
	}

	public String getMerchantIp() {
		return merchantIp;
	}

	public void setMerchantIp(String merchantIp) {
		this.merchantIp = merchantIp;
	}

	public String getMerchantUserAgent() {
		return merchantUserAgent;
	}

	public void setMerchantUserAgent(String merchantUserAgent) {
		this.merchantUserAgent = merchantUserAgent;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(String deleted_at) {
		this.deleted_at = deleted_at;
	}

}
