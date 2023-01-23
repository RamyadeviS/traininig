package com.chain.model;

public class Register {

	private Long aadharNo;
	private String userName;
	private String mailId;
	private String password;
	private Long  mobileNo;

	public void User(Long aadharNo, String userName, String mailId, String password, Long mobileNo) {
		
		this.aadharNo = aadharNo;
		this.userName = userName;
		this.mailId = mailId;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	public Long getAadharNo() {
		return aadharNo;
	}
	public Long setAadharNo(Long aadharNo) {
		return this.aadharNo = aadharNo;
	}
	public String getUserName() {
		return userName;
	}
	public String setUserName(String userName) {
		return this.userName = userName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassword() {
		return password;
	}
	public String setPassword(String password) {
		return this.password = password;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public Long setMobileNo(Long mobileNo) {
		return this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "User [aadharNo=" + aadharNo + ", userName=" + userName + ", mailId=" + mailId + ", password=" + password
				+ ", mobileNo=" + mobileNo + "]";
	}
	
}

