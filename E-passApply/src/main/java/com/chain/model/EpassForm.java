package com.chain.model;

public class EpassForm {
	
	private String applicationNo;
    private String applicantName;
    private String aadharNo;
    private String gender;
    private String reason;
    private String fatherName;
    private String dob;
    private String fromDistrict;
    private String toDistrict;
    private String state;
    private String travelDate;
    private String returnDate;
    private String noOfPassengers;
    private String vehicleNo;
    private String mobileNo;
    private String vaccinationCertificate;
    
	public EpassForm() {
		super();
		
		
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
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

	public String getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(String noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
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
		return "EpassForm [applicationNo=" + applicationNo + ", applicantName=" + applicantName + ", aadharNo="
				+ aadharNo + ", gender=" + gender + ", reason=" + reason + ", fatherName=" + fatherName + ", dob=" + dob
				+ ", fromDistrict=" + fromDistrict + ", toDistrict=" + toDistrict + ", state=" + state + ", travelDate="
				+ travelDate + ", returnDate=" + returnDate + ", noOfPassengers=" + noOfPassengers + ", vehicleNo="
				+ vehicleNo + ", mobileNo=" + mobileNo + ", vaccinationCertificate=" + vaccinationCertificate + "]";
	}
  
 	
}