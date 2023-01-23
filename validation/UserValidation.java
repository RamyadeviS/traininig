package org.chainsys.validation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.chainsys.E_pass.JDBCConnection;
import org.chainsys.myexception.AadharNoException;
import org.chainsys.myexception.ApplicantNameException;
import org.chainsys.myexception.ApplicationNoException;
import org.chainsys.myexception.DestinationException;
import org.chainsys.myexception.DobException;
import org.chainsys.myexception.ExistingMailIdException;
import org.chainsys.myexception.FromDistrictException;
import org.chainsys.myexception.GenderException;
import org.chainsys.myexception.MailIdException;
import org.chainsys.myexception.MobileNoException;
import org.chainsys.myexception.NameException;
import org.chainsys.myexception.NoOfPassengers;
import org.chainsys.myexception.PasswordException;
import org.chainsys.myexception.ReasonException;
import org.chainsys.myexception.SourceException;
import org.chainsys.myexception.StateException;
import org.chainsys.myexception.TicketNoException;
import org.chainsys.myexception.ToDistrictException;
import org.chainsys.myexception.TravelDateException;
import org.chainsys.myexception.VaccinationCertificateException;

public class UserValidation {
	public boolean aadharNoValidation(long adharNo) throws AadharNoException {
		String regex="\\d{12}"; 
		  String adharNo1=Long.toString(adharNo);
		  Pattern pattern=Pattern.compile(regex);
	    	Matcher match=pattern.matcher(adharNo1);
	    	Boolean b=match.matches();//check matching
	    	if(b==true) {
	    		return true;
	    		
	    	}
	    	else
	    		throw new AadharNoException();
	}
	
	public static boolean nameValidation(String name)throws NameException{
		boolean mat=name.matches("[a-z A-Z]+");//Initializing name format
		if(mat==true) { 
			return true;
    }
		else {
			throw new NameException();
		}
}
	
    public static boolean mailIdValidation(String email) throws MailIdException {
    	String regex="^[a-zA-Z0-9+.-]+@[a-zA-Z+.-]+$"; //Initializing mail format
    	Pattern p=Pattern.compile(regex);
    	Matcher m=p.matcher(email);
    	Boolean b=m.matches();//check matching
    
    	if(b==true) {
    		return true;
    	}
    	else {
    		throw new MailIdException();
    }
    }
    
    public Boolean existingmailIdValidation(String mailId) throws Exception  {
        String mail = mailId;
        Connection connection = JDBCConnection.getConnection();
        String query = "select mail_id from userDetails ";
        PreparedStatement ps = connection.prepareStatement(query);/// Already existing Email
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String mailId1 = rs.getString(1);
            if (mailId1.equals(mailId)) {
            	throw new ExistingMailIdException();
            	//return true;
            }
        
        
        }
		return true;
    }
    
    public static boolean passwordValidation(String password) throws PasswordException{
    	/*String  regex="^(?=.?[A-Z])(?=.?[a-z])(?=.?[0-9])(?=.?[#?!@$%^&*-]).{8,10}$";          //Initializing password format
    	Pattern p=Pattern.compile(regex);
    	Matcher m=p.matcher(password);
    	Boolean b=m.matches();//check matching
    	if(b==true) {
		return true;
	}
	else {
		throw new PasswordException();
	}
    }*/
		//throw new Exception("Invalid password");\
    	
  if(password.length()==8 && (!password.equals(null))) {
    return true;
    
   }
    	else {
    		throw new PasswordException();
    	}
    	
    }

	public boolean mobileNoValidation(long mobileNo) throws MobileNoException {
		String regex="\\d{10}"; //Initializing mobile no format
		  String mobileNo1=Long.toString(mobileNo);
		  Pattern pattern=Pattern.compile(regex);
	    	Matcher match=pattern.matcher(mobileNo1);
	    	Boolean boolean1=match.matches();//check matching
	    	if(boolean1==true) {
	    		return true;
	    		
	    	}
	    	else {
	    		throw new MobileNoException(); 
   }
	
 }

    public boolean applicationNoValidation(long applicationNo) throws ApplicationNoException {
    if(applicationNo!=0) {
	return true;
    }
       else {
	throw new ApplicationNoException();
}
 }
    
    public static boolean applicantNameValidation(String applicantname)throws ApplicantNameException{
		boolean matches=applicantname.matches("[a-z A-Z]+");//Initializing name format
		if(matches==true) { 
			return true;
    }
		else {
			throw new ApplicantNameException();
		}
}
    
    public boolean genderValidation(String gender) throws GenderException {
    String regex="^([M|m]ale|[F|f]emale|[T|t]ransgender)$";
    Pattern pattern=Pattern.compile(regex);
  	Matcher match=pattern.matcher(gender);
  	Boolean boolean1=match.matches();//check matching
  	if(boolean1==true) {
  		return true;
  		
  	}
  	else {
  		throw new GenderException(); 
}
    }

  	public boolean dobValidation(String dob) throws DobException {
  	String regex="^(0?[1-9]|[12]\\d|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";	
  	//String regex="([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
  	Pattern pattern=Pattern.compile(regex);
  	Matcher match=pattern.matcher(dob);
  	Boolean boolean1=match.matches();//check matching
  	if(boolean1==true) {
  		return true;
  		
  	}
  	else {
  		throw new DobException(); 
  	}
 }
  	
	public boolean noOfPassengersValidation(int noOfPassengers) throws NoOfPassengers {
	 
		if(noOfPassengers<=5) {
			return true;
		}
		else {
			throw new NoOfPassengers();
		
	 }
	}
	
	public boolean travelDateValidation(String travelDate ) throws TravelDateException {
	  	String regex="^(0?[1-9]|[12]\\d|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";	
	  	//String regex="([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
	  	Pattern pattern=Pattern.compile(regex);
	  	Matcher match=pattern.matcher(travelDate);
	  	Boolean boolean1=match.matches();//check matching
	  	if(boolean1==true) {
	  		return true;
	  		
	  	}
	  	else {
	  		throw new TravelDateException(); 
	  	}
	 }
	
	public boolean vaccinationCertificateValidation(String vaccinationCertificate) throws VaccinationCertificateException {
		 
		if(vaccinationCertificate.equals("yes")){
			System.out.println("certificate is available you can apply the e-pass");
			return true;
		}
		else {
			throw new VaccinationCertificateException();
		
	 }
	}
	
    public static boolean fromDistrictValidation( String fromDistrict)throws FromDistrictException{
		boolean matches=fromDistrict.matches("[a-z A-Z]+");//Initializing name format
		if(matches==true) { 
			return true;
    }
		else {
			throw new FromDistrictException();
		}
}
	
    public static boolean toDistrictValidation( String toDistrict)throws ToDistrictException{
		boolean matches=toDistrict.matches("[a-z A-Z]+");//Initializing name format
		if(matches==true) { 
			return true;
    }
		else {
			throw new ToDistrictException();
		}
}
	
    public static boolean stateValidation( String state)throws StateException{
		boolean matches=state.matches("[a-z A-Z]+");//Initializing name format
		if(matches==true) { 
			return true;
    }
		else {
			throw new StateException();
		}
    }
	
    public static boolean ticketNoValidation(String ticketNo) throws TicketNoException{
    
          String regex=	"([A-Z]+[0-9]+)";
    	//String regex=(".*[^a-z^0-9].*"); //Initializing mobile no format
		  Pattern pattern=Pattern.compile(regex);
	    	Matcher match=pattern.matcher(ticketNo);
	    	Boolean boolean1=match.matches();//check matching
	    	if(boolean1==true) {
	    		return true;
	    		
	    	}
	    	else {
	    		throw new TicketNoException(); 
 }
	
}
    public static boolean ReasonValidation(String reason)throws ReasonException{
    	if(reason.equals("logistic_deliveries")|| reason.equals("medical_supply")|| reason.equals("Essential_services") || reason.equals("medical_emergency")|| reason.equals("Ecommerce_delivery_boys")) {
           return true;
           
    	}
    	else {
    		throw new ReasonException();
    	}
    }
    public static boolean sourceValidation( String source)throws SourceException{
		boolean matches=source.matches("[a-z A-Z]+");//Initializing name format
		if(matches==true) { 
			return true;
    }
		else {
			throw new SourceException();
		}
    }
    public static boolean destinationValidation( String destination)throws DestinationException{
		boolean matches=destination.matches("[a-z A-Z]+");//Initializing name format
		if(matches==true) { 
			return true;
    }
		else {
			throw new DestinationException();
}

    }
}


