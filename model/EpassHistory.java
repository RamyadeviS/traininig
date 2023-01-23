package org.chainsys.model;

public class EpassHistory {

	private Long aadharNo;
	private Long mobileNo;
	public EpassHistory() {
		super();
		
	}
	public EpassHistory(Long aadharNo, Long mobileNo) {
		super();
		this.aadharNo = aadharNo;
		this.mobileNo = mobileNo;
	}
	public Long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "EpassHistory [aadharNo=" + aadharNo + ", mobileNo=" + mobileNo + "]";
	}
	
	
  }
