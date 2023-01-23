package org.chainsys.model;

public class EpassApplyStatus {
 
	private Long applicationNo;
    private String applicantName;
    private Long aadharNo;
    private String vaccinationCertificate;
    private String status;
	public EpassApplyStatus() {
		super();
		
	}
	public EpassApplyStatus(Long applicationNo, String applicantName, Long aadharNo, String vaccinationCertificate,
			String status) {
		super();
		this.applicationNo = applicationNo;
		this.applicantName = applicantName;
		this.aadharNo = aadharNo;
		this.vaccinationCertificate = vaccinationCertificate;
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
	public String getVaccinationCertificate() {
		return vaccinationCertificate;
	}
	public void setVaccinationCertificate(String vaccinationCertificate) {
		this.vaccinationCertificate = vaccinationCertificate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "EpassApplyStatus [applicationNo=" + applicationNo + ", applicantName=" + applicantName + ", aadharNo="
				+ aadharNo + ", vaccinationCertificate=" + vaccinationCertificate + ", status=" + status + "]";
	}
 
}
