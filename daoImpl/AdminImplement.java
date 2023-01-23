package org.chainsys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.chainsys.E_pass.JDBCConnection;
import org.chainsys.dao.AdminInterface;
import org.chainsys.model.Admin;
import org.chainsys.model.EpassApplyForm;
import org.chainsys.model.TravelHistory;

public class AdminImplement implements AdminInterface {
      
	   Admin admin=new Admin();
	   EpassApplyImplement eai=new EpassApplyImplement();
	   TravelHistoryImplement travelImpl=new TravelHistoryImplement();
	   
	@Override
	public boolean adminLogin(Admin login)  throws ClassNotFoundException, SQLException, Exception {
	 String mailId=login.getMailId();
	 String password=login.getPassword();
		
		Connection connection =JDBCConnection.getConnection();
        String query="select mail_id,password from admin";
        PreparedStatement ps=connection.prepareStatement(query);
		if(login.getMailId().equals("admin@gmail.com")) {
		 if(login.getPassword().equals("admin712")) {
			 return true;
		
	}
	else {
		
		 System.out.println("Invalid password");
    }
        }
		return false;
	} 
		
	//validating the login process,checks if the mailId & password exist
    public void validLogin(Admin login) throws Exception {
        if(adminLogin(login)) {
            System.out.println("Login successfully");
        }
        else {
            System.out.println("Invalid mailId or password!!!Login failed");
        }
        
    }
	
	@Override
			public List<EpassApplyForm> ListOfUser() throws ClassNotFoundException, SQLException {
				Connection connection = JDBCConnection.getConnection();// JDBC connectivity
				String query ="select application_no,applicant_name,aadhar_no,gender,reason,father_name,dob,from_district,to_district,state,travel_date,no_of_passengers,vehicle_no,mobile_no,vaccination_certificate from epassApply";
	   
				PreparedStatement pst=connection.prepareStatement(query);
				ArrayList<EpassApplyForm>list=new ArrayList<EpassApplyForm>();
				ResultSet rst=pst.executeQuery();
				while(rst.next()) {
					
				  Long application_no=rst.getLong("application_no");
				  String applicant_name=rst.getString("applicant_name");
				  Long Aadhar_no=rst.getLong("aadhar_no");
				  String gender=rst.getString("gender");
				  String reason=rst.getString("reason");
				  String father_name=rst.getString("father_name");
				  String dob=rst.getString("dob");
				  String from_district=rst.getString("from_district");
				  String to_district=rst.getString("to_district");
				  String state=rst.getString("state");
				  String travel_date=rst.getString("travel_date");
				  Integer no_of_passengers=rst.getInt("no_of_passengers");
				  String vehicle_no=rst.getString("vehicle_no");
				  Long mobile_no=rst.getLong("mobile_no");
				  String vaccination_certificate=rst.getString("vaccination_certificate");
				  
				  EpassApplyForm apply=new EpassApplyForm();
				  
				  apply.setApplicationNo(application_no);
				  apply.setApplicantName(applicant_name);
				  apply.setAadharNo(Aadhar_no);
				  apply.setGender(gender);
				  apply.setReason(reason);
				  apply.setFatherName(father_name);
				  apply.setDob(dob);
				  apply.setFromDistrict(to_district);
				  apply.setToDistrict(to_district);
				  apply.setState(state);
				  apply.setTravelDate(travel_date);
				  apply.setNoOfPassengers(no_of_passengers);
				  apply.setVehicleNo(vehicle_no);
				  apply.setMobileNo(mobile_no);
				  apply.setVaccinationCertificate(vaccination_certificate);
				  
					list.add(apply);
					System.out.println(list);	
			
	}
				return list;
				
 }
	
	public List<TravelHistory> userList() throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();// JDBC connectivity
		String query ="select application_no,applicant_name,ticket_no,travel_date,time,aadhar_no,gender,reason,father_name,dob,source,destination,no_of_passengers,mobile_no,vaccination_certificate from travelHistory";

		PreparedStatement pst=connection.prepareStatement(query);
		ArrayList<TravelHistory>list=new ArrayList<TravelHistory>();
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
	    
			Long application_no=rs.getLong("application_no");
			String applicant_name=rs.getString("applicant_name");
			String ticket_no=rs.getString("ticket_no");
			String travel_date=rs.getString("travel_date");
			String time=rs.getString("time");
			Long aadhar_no=rs.getLong("aadhar_no");
			String gender=rs.getString("gender");
			String reason=rs.getString("reason");
			String father_name=rs.getString("father_name");
			String dob=rs.getString("dob");
			String source =rs.getString("source");
			String destination=rs.getString("destination");
			Integer no_of_passengers=rs.getInt("no_of_passengers");
		    Long mobile_no=rs.getLong("mobile_no");
		    String vaccination_certificate=rs.getString("vaccination_certificate");
			
			TravelHistory travel=new TravelHistory();	
			
			travel.setApplicationNo(application_no);
			travel.setApplicantName(applicant_name);
			travel.setTicketNo(ticket_no);
			travel.setTravelDate(travel_date);
			travel.setTime(time);
			travel.setAadharNo(aadhar_no);
			travel.setGender(gender);
			travel.setReason(reason);
			travel.setFatherName(father_name);
			travel.setDob(dob);
			travel.setSource(source);
			travel.setDestination(destination);
			travel.setNoOfPassengers(no_of_passengers);
			travel.setMobileNo(mobile_no);
			travel.setVaccinationCertificate(destination);
			

			list.add(travel);
			System.out.println(list);	
	
}
		return list;
		
}

}	
	
				
	
			
	
