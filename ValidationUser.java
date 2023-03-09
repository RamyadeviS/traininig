package com.epassproject.epassform.validation;

import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.epassproject.epassform.myexception.InvalidAadharNoException;
import com.epassproject.epassform.myexception.InvalidApplicantNameException;
import com.epassproject.epassform.myexception.InvalidApplicationNoException;
import com.epassproject.epassform.myexception.InvalidDobException;
import com.epassproject.epassform.myexception.InvalidGenderException;
import com.epassproject.epassform.myexception.InvalidMailIdException;
import com.epassproject.epassform.myexception.InvalidMobileNoException;
import com.epassproject.epassform.myexception.InvalidNameException;
import com.epassproject.epassform.myexception.InvalidNoOfPassengers;
import com.epassproject.epassform.myexception.InvalidPasswordException;
import com.epassproject.epassform.myexception.InvalidReasonException;
import com.epassproject.epassform.myexception.InvalidReturnDateException;
import com.epassproject.epassform.myexception.InvalidSourceException;
import com.epassproject.epassform.myexception.InvalidTicketNoException;
import com.epassproject.epassform.myexception.InvalidVaccinationCertificateException;
import com.epassproject.epassform.myexception.InvalidVehicleNoException;

public class ValidationUser {
	public boolean aadharNoValidation(long adharNo) throws InvalidAadharNoException {
		String regex="\\d{12}"; 
		  String adharNo1=Long.toString(adharNo);
		  Pattern pattern=Pattern.compile(regex);
	    	Matcher match=pattern.matcher(adharNo1); 
	    	boolean boolean1=match.matches();//check matching 
	    	if(boolean1) {
	    		return true;
	    		
	    	} 
	    	else
	    		throw new InvalidAadharNoException();
	}
	
	public static boolean nameValidation(String name)throws InvalidNameException{
		boolean match=name.matches("[a-z A-Z]+");//Initializing name format
		if(match) { 
			return true;
    }
		else {
			throw new InvalidNameException();
		}
}
	
    public static boolean mailIdValidation(String email) throws InvalidMailIdException {
    	String regex="^[a-zA-Z0-9+.-]+@[a-zA-Z+.-]+$"; //Initializing mail format
    	Pattern pattern=Pattern.compile(regex);
    	Matcher match=pattern.matcher(email);
    	boolean boolean2=match.matches();//check matching
    
    	if(boolean2) {
    		return true;
    	}
    	else {
    		throw new InvalidMailIdException();
    }
    }

   public static boolean passwordValidation(String password) throws InvalidPasswordException{
  if(password.length() >8 ) {
    return true;
    
   }
    	else {
    		throw new InvalidPasswordException();
    	}
    	
    }

	public boolean mobileNoValidation(long mobileNo) throws InvalidMobileNoException {
		String regex="\\d{10}"; //Initializing mobile no format
		  String mobileNo1=Long.toString(mobileNo);
		  Pattern pattern=Pattern.compile(regex);
	    	Matcher match=pattern.matcher(mobileNo1);
	    	boolean boolean2=match.matches();//check matching
	    	if(boolean2) {
	    		return true;
	    		
	    	}
	    	else {
	    		throw new InvalidMobileNoException(); 
   }
	
 }

    public boolean applicationNoValidation(long applicationNo) throws InvalidApplicationNoException {
    if(applicationNo!=0) {
	return true;
    }
       else {
	throw new InvalidApplicationNoException();
}
 }
    
    public static boolean applicantNameValidation(String applicantname)throws InvalidApplicantNameException{
		boolean matches=applicantname.matches("^[A-Za-z]*$");//Initializing name format
		if(matches) { 
			return true;
    }
		else {
			throw new InvalidApplicantNameException();
		}
}
    
    public boolean genderValidation(String gender) throws InvalidGenderException {
    String regex="^([M|m]ale|[F|f]emale|[T|t]ransgender)$";
    Pattern pattern=Pattern.compile(regex);
  	Matcher match=pattern.matcher(gender);
  	boolean boolean1=match.matches();//check matching
  	if(boolean1) {
  		return true;
  		
  	}
  	else {
  		throw new InvalidGenderException(); 
}
    }

  	public boolean dobValidation(Date dob) throws InvalidDobException {
  	String regex="([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
    String dob1=dob.toString();
  	Pattern pattern=Pattern.compile(regex);
  	Matcher match=pattern.matcher(dob1);
  	boolean boolean1=match.matches();//check matching
  	if(boolean1) {
  		return true;
  		
  	}
  	else {
  		throw new InvalidDobException(); 
  	}
 }
  	
	public boolean noOfPassengersValidation(int noOfPassengers) throws InvalidNoOfPassengers {
	 
		if(noOfPassengers<=5) {
			return true;
		}
		else {
			throw new InvalidNoOfPassengers();
		
	 }
	}
	
	public boolean dateValidation(Date returnDate ) throws InvalidReturnDateException {	
	  	String regex="([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
	  	String  returnDate1= returnDate.toString();
	  	Pattern pattern=Pattern.compile(regex);
	  	Matcher match=pattern.matcher( returnDate1);
	  	boolean boolean1=match.matches();//check matching
	  	if(boolean1) {
	  		return true;
	  		
	  	}
	  	else {
	  		throw new InvalidReturnDateException(); 
	  	}
	 }
	
	public boolean vaccinationCertificateValidation(String vaccinationCertificate) throws InvalidVaccinationCertificateException {
		 
		if(vaccinationCertificate.equals("yes")){
			return true;
		}
		else {
			throw new InvalidVaccinationCertificateException();
		
	 }
	}
	
    public static boolean vehicleNoValidation(String vehicleNo) throws InvalidVehicleNoException{
       String regex="([A-Z]+[0-6]+)";
	  Pattern pattern=Pattern.compile(regex);
	    	Matcher match=pattern.matcher(vehicleNo);
	    	boolean boolean1=match.matches();//check matching
	    	if(boolean1) {
	   	return true;	
	    	}
	    	else {
	    		throw new InvalidVehicleNoException(); 
}
	
}
    
    public static boolean ticketNoValidation(String ticketNo) throws InvalidTicketNoException{
    
          String regex=	"([A-Z]+[0-8]+)";
		  Pattern pattern=Pattern.compile(regex);
	    	Matcher match=pattern.matcher(ticketNo);
	    	boolean boolean1=match.matches();//check matching
	    	if(boolean1) {
	    		return true;
	    		
	    	}
	    	else {
	    		throw new InvalidTicketNoException(); 
 }
	
}
    public static boolean reasonValidation(String reason)throws InvalidReasonException{
    	if(reason.equals("logistic_deliveries")|| reason.equals("medical_supply")|| reason.equals("Essential_services") || reason.equals("medical_emergency")|| reason.equals("Ecommerce_delivery_boys")) {
           return true;
           
    	}
    	else {
    		throw new InvalidReasonException();
    	}
    }
    public static boolean placeValidation( String source)throws InvalidSourceException{
		boolean matches=source.matches("[a-z A-Z]+");//Initializing name format
		if(matches) { 
			return true;
    }
		else {
			throw new InvalidSourceException();
		}
    }

}


