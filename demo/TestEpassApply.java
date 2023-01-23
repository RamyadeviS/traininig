package org.chainsys.demo;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.chainsys.daoImpl.EpassApplyImplement;
import org.chainsys.daoImpl.ReasonImplement;
import org.chainsys.model.EpassApplyForm;
import org.chainsys.model.Reason;
import org.chainsys.validation.UserValidation;

public class TestEpassApply {

	public static void main(String[] args) throws Exception {
      EpassApplyImplement eai=new EpassApplyImplement();
      Scanner sc=new Scanner(System.in);
      EpassApplyForm apply=new EpassApplyForm();
      UserValidation u=new  UserValidation ();
      ReasonImplement reasonimp=new ReasonImplement();
      Reason r=new Reason();
    //ReasonImplement ri=new ReasonImplement();
      
    System.out.println("1.ListOFReasons");
  	System.out.println("2.insert"); 
  	System.out.println("3.update");
  	
   String input=sc.next();
  	switch(input){
     
  case "1":
  		
  		reasonimp.listOfReasons();
  		
  		break;
  		
  	case "2":
  		
  	   System.out.println("Enter the application no");
  		Long applicationNo=sc.nextLong();
  		apply.setApplicationNo(applicationNo);
  		
  		System.out.println("Enter the applicant name");
  		String applicantName=sc.next();
  		u.applicantNameValidation(applicantName);	
  		apply.setApplicantName(applicantName);
  		
  		System.out.println("Enter the aadhar no");
  		Long aadharNo=sc.nextLong();
  		u.aadharNoValidation(aadharNo);
  		apply.setAadharNo(aadharNo);
  		
  	    System.out.println("Enter the gender");
  		String gender=sc.next();
  		u.genderValidation(gender);
  		apply.setGender(gender);
  		
    //  eai.showReasons(input);
      //for(EpassApplyForm form1:reasondetails) {
      // System.out.println(form1);
      //  }
  		System.out.println("Enter the reason ");
  		
  		String reason=sc.next();
     	apply.setReason(reason);
	    
  	    System.out.println("Enter the father name");
  	    String fatherName=sc.next();
  	    apply.setFatherName(fatherName);
  	    
  	    System.out.println("Enter the dob");
  	    String dob=sc.next();
  	    u.dobValidation(dob);
  	    apply.setDob(dob); 
  	    
  	    System.out.println("Enter the from district");
  	    String fromDistrict=sc.next();
  	    u.fromDistrictValidation(fromDistrict);
  	    apply.setFromDistrict(fromDistrict);
  	
  	    System.out.println("Enter the to district");
  	    String toDistrict=sc.next();
  	    u.toDistrictValidation(toDistrict);
  	    apply.setToDistrict(toDistrict);
  	    
  	    System.out.println("Enter the state");
  	    String state =sc.next();
  	    u.stateValidation(state);
  	    apply.setState(state);         
  	    
  	   System.out.println("Enter the travel date");
  	    String travelDate=sc.next();
  	    u.travelDateValidation(travelDate);
  	    apply.setTravelDate(travelDate);
  	
  	    System.out.println("Enter the no of passengers");
  	    Integer noOfPassengers=sc.nextInt();
  	    u.noOfPassengersValidation(noOfPassengers);
  	    apply.setNoOfPassengers(noOfPassengers);
  	    
  	    System.out.println("enter the vehicle no");
  	    String vehicleNo=sc.next();
  	    vehicleNo.toUpperCase();
  	    System.out.println(vehicleNo);
  	    apply.setVehicleNo(vehicleNo);
  	    
  	    System.out.println("Enter the mobile no");
  	    Long mobileNo=sc.nextLong();
  	    u.mobileNoValidation(mobileNo);
  	    apply.setMobileNo(mobileNo);    
  	    
  	    System.out.println("Enter the vaccination certificate");
  	    String vaccinationCertificate=sc.next();
  	    u.vaccinationCertificateValidation(vaccinationCertificate);
  	    apply.setVaccinationCertificate(vaccinationCertificate);    
  	    
  	    eai.insertApplyForm(apply);
  	    System.out.println("test end");
  	    break; 
  		
  	case "3":
  		
  		System.out.println("Enter the no of passengers");
  		Integer noOfPassengers1=sc.nextInt();
  	    apply.setNoOfPassengers(noOfPassengers1);
  	
  		System.out.println("Enter the application no");
  		Long applicationNo1=sc.nextLong();
  		apply.setApplicationNo(applicationNo1);
  		
  		//System.out.println("Enter the gender");
  		//String gender1=sc.next();
  		//apply.setGender(gender1);
  		eai.updateApplyForm(apply);
  		
  		break;
  		
  	
  	}
  	

	}
}






