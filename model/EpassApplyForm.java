package org.chainsys.model;

public class EpassApplyForm {
     private Long applicationNo;
     private String applicantName;
     private Long aadharNo;
     private String gender;
     private String reason;
     private String fatherName;
     private String dob;
     private String fromDistrict;
     private String toDistrict;
     private String state;
     private String travelDate;
     private String returnDate;
     private Integer noOfPassengers;
     private String vehicleNo;
     private Long mobileNo; 
     private String vaccinationCertificate;
	
     public EpassApplyForm(String returnDate) {
		super();
		
	}

	public EpassApplyForm() {
		super();
		
	}

	public EpassApplyForm(Long applicationNo, String applicantName, Long aadharNo, String gender, String reason,
			String fatherName, String dob, String fromDistrict, String toDistrict, String state, String travelDate,
			Integer noOfPassengers, String vehicleNo, Long mobileNo, String vaccinationCertificate) {
		super();
		this.applicationNo = applicationNo;
		this.applicantName = applicantName;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.reason = reason;
		this.fatherName = fatherName;
		this.dob = dob;
		this.fromDistrict = fromDistrict;
		this.toDistrict = toDistrict;
		this.state = state;
		this.travelDate = travelDate;
		this.returnDate = returnDate;
		this.noOfPassengers = noOfPassengers;
		this.vehicleNo = vehicleNo;
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

	public String getFromDistrict() {
		return fromDistrict;
	}

	public void setFromDistrict(String fromDistrict) {
		this.fromDistrict = fromDistrict;
	}

	public String getToDistrict() {
		return toDistrict;
	}

	public void setToDistrict(String toDistrict) {
		this.toDistrict = toDistrict;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public Integer getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(Integer noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
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
		return "EpassApplyForm [applicationNo=" + applicationNo + ", applicantName=" + applicantName + ", aadharNo="
				+ aadharNo + ", gender=" + gender + ", reason=" + reason + ", fatherName=" + fatherName + ", dob=" + dob
				+ ", fromDistrict=" + fromDistrict + ", toDistrict=" + toDistrict + ", state=" + state + ", travelDate="
				+ travelDate + ", returnDate=" + returnDate + ", noOfPassengers=" + noOfPassengers + ", vehicleNo="
				+ vehicleNo + ", mobileNo=" + mobileNo + ", vaccinationCertificate=" + vaccinationCertificate + "]";
	}
}