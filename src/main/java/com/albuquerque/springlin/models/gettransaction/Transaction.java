package com.albuquerque.springlin.models.gettransaction;

public class Transaction {

	private String referenceNo;
	private Integer merchantId;
	private String status;
	private String channel;
	private String customData;
	private String chainId;
	private String type;
	private String agentInfoId;
	private String operation;
	private String updated_at;
	private String created_at;
	private Integer id;
	private Integer fxTransactionId;
	private Integer acquirerTransactionId;
	private String code;
	private String message;
	private String transactionId;
	private Agent agent;

	public Transaction() {
	}

	public Transaction(String referenceNo, Integer merchantId, String status, String channel, String customData,
			String chainId, String type, String agentInfoId, String operation, String updated_at, String created_at,
			Integer id, Integer fxTransactionId, Integer acquirerTransactionId, String code, String message,
			String transactionId, Agent agent) {
		super();
		this.referenceNo = referenceNo;
		this.merchantId = merchantId;
		this.status = status;
		this.channel = channel;
		this.customData = customData;
		this.chainId = chainId;
		this.type = type;
		this.agentInfoId = agentInfoId;
		this.operation = operation;
		this.updated_at = updated_at;
		this.created_at = created_at;
		this.id = id;
		this.fxTransactionId = fxTransactionId;
		this.acquirerTransactionId = acquirerTransactionId;
		this.code = code;
		this.message = message;
		this.transactionId = transactionId;
		this.agent = agent;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCustomData() {
		return customData;
	}

	public void setCustomData(String customData) {
		this.customData = customData;
	}

	public String getChainId() {
		return chainId;
	}

	public void setChainId(String chainId) {
		this.chainId = chainId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAgentInfoId() {
		return agentInfoId;
	}

	public void setAgentInfoId(String agentInfoId) {
		this.agentInfoId = agentInfoId;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
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

	public Integer getFxTransactionId() {
		return fxTransactionId;
	}

	public void setFxTransactionId(Integer fxTransactionId) {
		this.fxTransactionId = fxTransactionId;
	}

	public Integer getAcquirerTransactionId() {
		return acquirerTransactionId;
	}

	public void setAcquirerTransactionId(Integer acquirerTransactionId) {
		this.acquirerTransactionId = acquirerTransactionId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

}
