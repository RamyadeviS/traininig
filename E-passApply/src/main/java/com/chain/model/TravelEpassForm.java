package com.chain.model;

public class TravelEpassForm {

	 private Long applicationNo;
     private String applicantName;
     private String ticketNo;
     private String travelDate;
     private String returnDate;
     private String time;
     private Long aadharNo;
     private String gender;
     private String reason;
     private String fatherName;
     private String dob;
     private String source;
     private String destination;
     private Integer noOfPassengers;
     private Long mobileNo; 
     private String vaccinationCertificate;
     
	public TravelEpassForm() {
		
	}
	
	public TravelEpassForm(Long applicationNo, String applicantName, String ticketNo, String travelDate,
			String returnDate, String time, Long aadharNo, String gender, String reason, String fatherName,
			String dob, String source, String destination, Integer noOfPassengers, Long mobileNo,
			String vaccinationCertificate) {
		super();
		
		this.applicationNo = applicationNo;
		this.applicantName = applicantName;
		this.ticketNo = ticketNo;
		this.travelDate = travelDate;
		this.returnDate = returnDate;
		this.time = time;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.reason = reason;
		this.fatherName = fatherName;
		this.dob = dob;
		this.source = source;
		this.destination = destination;
		this.noOfPassengers = noOfPassengers;
		this.mobileNo = mobileNo;
		this.vaccinationCertificate = vaccinationCertificate;
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
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(Integer noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getVaccinationCertificate() {
		return vaccinationCertificate;
	}
	public void setVaccinationCertificate(String vaccinationCertificate) {
		this.vaccinationCertificate = vaccinationCertificate;
	}
	@Override
	public String toString() {
		return "TravelHistory [applicationNo=" + applicationNo + ", applicantName=" + applicantName + ", ticketNo="
				+ ticketNo + ", travelDate=" + travelDate + ", returnDate=" + returnDate + ", time=" + time
				+ ", aadharNo=" + aadharNo + ", gender=" + gender + ", reason=" + reason + ", fatherName="
				+ fatherName + ", dob=" + dob + ", source=" + source + ", destination=" + destination
				+ ", noOfPassengers=" + noOfPassengers + ", mobileNo=" + mobileNo + ", vaccinationCertificate="
				+ vaccinationCertificate + "]";
	}

}
