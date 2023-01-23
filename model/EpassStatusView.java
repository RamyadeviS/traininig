package org.chainsys.model;

public class EpassStatusView {

	private Long applicationNo;
    private String applicantName;
    private Long aadharNo;
    private String status;
    
	public EpassStatusView() {
		super();
	}

	public EpassStatusView(Long applicationNo, String applicantName, Long aadharNo, String status) {
		super();
		this.applicationNo = applicationNo;
		this.applicantName = applicantName;
		this.aadharNo = aadharNo;
		this.status = status;
	}

	public Long getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(Long applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public Long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EpassStatusView [applicationNo=" + applicationNo + ", applicantName=" + applicantName + ", aadharNo="
				+ aadharNo + ", status=" + status + "]";
	}
     
	}