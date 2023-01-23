package org.chainsys.demo;

import java.util.Scanner;

import org.chainsys.daoImpl.ReasonImplement;
import org.chainsys.daoImpl.TravelHistoryImplement;
import org.chainsys.model.TravelHistory;
import org.chainsys.validation.UserValidation;

public class TestTravelHistory {


	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		TravelHistoryImplement travelImpl=new TravelHistoryImplement();
		TravelHistory travel=new TravelHistory();
		ReasonImplement reasonimp=new ReasonImplement();
		UserValidation u=new  UserValidation ();
	   
		System.out.println("1.ListOfReasons");
	    System.out.println("2.insert");
	  	System.out.println("3.update"); 
	  	
	  	String input = sc.next();
	  	
	  	switch(input){
	     
	  	case "1":
	  	reasonimp.listOfReasons();
	  	break;
	  	
	  	case "2":
	  		
	  	    System.out.println("Enter the application no");
	  		Long applicationNo=sc.nextLong();
	  		u.applicationNoValidation(applicationNo);
	  		travel.setApplicationNo(applicationNo);
	  		
	  		System.out.println("Enter the applicant name");
	  		String applicantName=sc.next();
	  		u.applicantNameValidation(applicantName);	
	  		travel.setApplicantName(applicantName);
	  		
	  	    System.out.println("Enter the ticket no");
		    String ticketNo=sc.next();
		    u.ticketNoValidation(ticketNo);
	        travel.setTicketNo(ticketNo);	  	
		  	  
	        System.out.println("Enter the travel date");
		  	String travelDate=sc.next();
		  	travel.setTravelDate(travelDate);
		  	u.travelDateValidation(travelDate) ;
		  	
		  	System.out.println("Enter the time");
		  	String time=sc.next();
		  	travel.setTime(time);  
		  	
	  		System.out.println("Enter the aadhar no");
	  		Long aadharNo=sc.nextLong();
	  		u.aadharNoValidation(aadharNo);
	  		travel.setAadharNo(aadharNo);
	  		
	  	    System.out.println("Enter the gender");
	  		String gender=sc.next();
	  		u.genderValidation(gender);
	  		travel.setGender(gender);
	  		
	  		System.out.println("Enter the reason");
	  		String reason=sc.next();
		    travel.setReason(reason);
		    u.ReasonValidation(reason);
		    
	  	    System.out.println("Enter the father name");
	  	    String fatherName=sc.next();
	  	    travel.setFatherName(fatherName);
	  	    
	  	    System.out.println("Enter the dob");
	  	    String dob=sc.next();
	  	    u.dobValidation(dob);
	  	    travel.setDob(dob);
	  	    
	  	    System.out.println("Enter the source");
	  	    String source=sc.next();
	  	    u.sourceValidation(source);
	  	    travel.setSource(source);
	  	    
	  	    System.out.println("Enter the destination");
	  	    String destination=sc.next();
	  	    u.destinationValidation(destination);
	  	    travel.setDestination(destination);        
	  	    
	  	    System.out.println("Enter the no of passengers");
	  	    Integer noOfPassengers=sc.nextInt();
	  	    u.noOfPassengersValidation(noOfPassengers);
	  	    travel.setNoOfPassengers(noOfPassengers);
	  	    
	  	    
	  	    System.out.println("Enter the mobile no");
	  	    Long mobileNo=sc.nextLong();
	  	    u.mobileNoValidation(mobileNo);
	  	    travel.setMobileNo(mobileNo);   
	  	    
	  	    System.out.println("Enter the vaccination certificate");
	  	    String vaccinationCertificate=sc.next();
	  	    u.vaccinationCertificateValidation(vaccinationCertificate);
	  	    travel.setVaccinationCertificate(vaccinationCertificate);
	  	    travelImpl.insertTravelHistory(travel);
	  	   
	  	    break; 
	  	  
	  	case "3":
	  		
	  		System.out.println("Enter the travel date");
	  		String travelDate1=sc.next();
	  	    travel.setTravelDate(travelDate1);
	  	
	  		System.out.println("Enter the application no");
	  		Long applicationNo1=sc.nextLong();
	  		travel.setApplicationNo(applicationNo1);
	  		
	  		//System.out.println("Enter the gender");
	  		//String gender1=sc.next();
	  		//travel.setGender(gender1); 
	  		travelImpl.updateTravelHistory(travel);
	  		
	  		break;
	  		
	  	}
        
		}
	}

