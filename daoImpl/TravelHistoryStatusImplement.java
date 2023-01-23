package org.chainsys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.chainsys.E_pass.JDBCConnection;
import org.chainsys.dao.TravelHistoryStatusInterface;
import org.chainsys.model.TravelEpassStatus;

public class TravelHistoryStatusImplement implements TravelHistoryStatusInterface {

	@Override
	public String TravelHistoryStatusCheck(TravelEpassStatus TravelStatus) throws ClassNotFoundException, SQLException, Exception {
		
		Connection connection = JDBCConnection.getConnection();// JDBC connectivity
		String query="insert into travelHistoryStatus (application_no,applicant_name,ticket_no,aadhar_no,vaccination_certificate,status) values (?,?,?,?,?,?)";
	    PreparedStatement ps1=connection.prepareStatement(query);
	    
	    ps1.setLong(1,TravelStatus.getApplicationNo());
	    ps1.setString(2,TravelStatus.getApplicantName());
	    ps1.setString(3,TravelStatus.getTicketNo());
	    ps1.setLong(4,TravelStatus.getAadharNo());
	    ps1.setString(5,TravelStatus.getVaccinationCertificate());
	    ps1.setString(6,TravelStatus.getStatus());

	    int rows = ps1.executeUpdate();
		System.out.println(rows);
		System.out.println("Values are Inserted");
		
	 return query;
     
	}

}
