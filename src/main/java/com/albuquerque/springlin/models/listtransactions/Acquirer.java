package com.albuquerque.springlin.models.listtransactions;

public class Acquirer {

	private Integer id;
	private String name;
	private String code;
	private String type;

	public Acquirer() {
	}

	public Acquirer(Integer id, String name, String code, String type) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
