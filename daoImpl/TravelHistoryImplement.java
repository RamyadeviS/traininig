package org.chainsys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.chainsys.E_pass.JDBCConnection;
import org.chainsys.dao.TravelHistoryInterface;
import org.chainsys.model.TravelHistory;

public class TravelHistoryImplement implements TravelHistoryInterface{

	@Override
	public String insertTravelHistory(TravelHistory insertHistory) throws ClassNotFoundException, SQLException, Exception {
		Connection connection = JDBCConnection.getConnection();// JDBC connectivity
		//System.out.println(connection);
		String query = "insert into travelHistory (application_no,applicant_name,ticket_no,travel_date,return_date,time,aadhar_no,gender,reason,father_name,dob,source,destination,no_of_passengers,mobile_no,vaccination_certificate) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    PreparedStatement ps=connection.prepareStatement(query);
	    ps.setLong(1,insertHistory.getApplicationNo());
		ps.setString(2,insertHistory.getApplicantName());
		ps.setString(3,insertHistory.getTicketNo());
		ps.setString(4,insertHistory.getTravelDate());
		ps.setString(5,insertHistory.getReturnDate());
		ps.setString(6,insertHistory.getTime());
		ps.setLong(7,insertHistory.getAadharNo());
		ps.setString(8,insertHistory.getGender());
		ps.setString(9,insertHistory.getReason());
		ps.setString(10,insertHistory.getFatherName());
	    ps.setString(11,insertHistory.getDob());
	    ps.setString(12,insertHistory.getSource());
	    ps.setString(13,insertHistory.getDestination());
	    ps.setInt(14,insertHistory.getNoOfPassengers());
	    ps.setLong(15,insertHistory.getMobileNo());
	    ps.setString(16,insertHistory.getVaccinationCertificate());
	    
	    int rows = ps.executeUpdate();
		System.out.println(rows);
		System.out.println("Values are Inserted");
		
		ps.close();
		connection.close();
		return query;
	}

	@Override
	public String updateTravelHistory(TravelHistory updateHistory) throws ClassNotFoundException, SQLException, Exception {
		
		Connection connection=JDBCConnection.getConnection();//JDBC connectivity
		//System.out.println(connection);
		String query="update  travelHistory SET travel_date=? where application_no=?";
			
	    PreparedStatement pst=connection.prepareStatement(query);
		pst.setString(1,updateHistory.getTravelDate());	
		pst.setLong(2,updateHistory.getApplicationNo());
	    int rows=pst.executeUpdate();
		System.out.println(rows);//update status
		System.out.println("Values are updated");
		return query;	
	}

	/*@Override
	public void TypesOfReason() throws ClassNotFoundException, SQLException, Exception {
	    	Connection connection = JDBCConnection.getConnection();// JDBC connectivity
	    	String query="select types_of_reasons from travelHistory";
	    					
	    	PreparedStatement pst=connection.prepareStatement(query);
	    	ResultSet rs=pst.executeQuery();
	    	while(rs.next()) {
	    		String reason1=rs.getString(1);
	    		System.out.println(reason1);
	    	
	    	   
		
	}

} */
	}
