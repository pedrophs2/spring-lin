package com.albuquerque.springlin.handlers;

public class ResponseHandler {

	private int code;
	private String message;
	private String details;
	private Object response;

	public ResponseHandler() {
	}

	public ResponseHandler(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public ResponseHandler(int code, String message, Object response) {
		super();
		this.code = code;
		this.message = message;
		this.response = response;
	}

	public ResponseHandler(int code, String message, String details) {
		super();
		this.code = code;
		this.message = message;
		this.details = details;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

}
