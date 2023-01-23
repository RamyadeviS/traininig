package org.chainsys.model;

public class TravelEpassStatus {

	private Long applicationNo;
    private String applicantName;
    private String ticketNo;
    private Long aadharNo;
    private String vaccinationCertificate;
    private String status;
	public TravelEpassStatus() {
		super();
			}
	public TravelEpassStatus(Long applicationNo, String applicantName, String ticketNo, Long aadharNo,
			String vaccinationCertificate, String status) {
		super();
		this.applicationNo = applicationNo;
		this.applicantName = applicantName;
		this.ticketNo = ticketNo;
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
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
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
		return "TravelEpassStatus [applicationNo=" + applicationNo + ", applicantName=" + applicantName + ", ticketNo="
				+ ticketNo + ", aadharNo=" + aadharNo + ", vaccinationCertificate=" + vaccinationCertificate
				+ ", status=" + status + "]";
	}
 
    
}