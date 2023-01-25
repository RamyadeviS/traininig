package com.training.practice.model;

public class MovieModel {

	private String name;
	private String password;
	private int id;
	private Long mobileNO;
	private String mailId;
	private String role;
	public  MovieModel () { //Default constructor

	}
	//Parameterized constructor
	public  MovieModel(String name, String password, int id, Long mobileNO, String mailId, String role) {
		super();
		this.name = name;
		this.password = password;
		this.id = id;
		this.mobileNO = mobileNO;
		this.mailId = mailId;
		this.role = role;
	}
	//Getters and Setters
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getMobileNO() {
		return mobileNO;
	}
	public void setMobileNO(Long mobileNO) {
		this.mobileNO = mobileNO;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	//to string
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", id=" + id + ", mobileNO=" + mobileNO + ", mailId="
				+ mailId + ", role=" + role + "]";
	}


}
