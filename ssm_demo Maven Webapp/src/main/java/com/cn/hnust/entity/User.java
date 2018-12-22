package com.cn.hnust.entity;

public class User {
	private Integer id;
	private String name;
	private String password;
	private String code;
	private String type;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	public User(Integer id, String name, String password, String code, String type) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.code = code;
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", code=" + code + ", type=" + type
				+ "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
