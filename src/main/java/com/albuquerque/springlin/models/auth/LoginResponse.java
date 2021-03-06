package com.albuquerque.springlin.models.auth;

public class LoginResponse {

	private String token;
	private String status;

	public LoginResponse() {
	}

	public LoginResponse(String token, String status) {
		super();
		this.token = token;
		this.status = status;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
