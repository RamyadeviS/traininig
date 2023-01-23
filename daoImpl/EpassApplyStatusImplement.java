package org.chainsys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.chainsys.E_pass.JDBCConnection;
import org.chainsys.dao.EpassApplyStatusInterface;
import org.chainsys.model.EpassApplyStatus;

public class EpassApplyStatusImplement implements EpassApplyStatusInterface {

	EpassApplyStatus Status=new  EpassApplyStatus();
	@Override
	public String epassApplyStatusCheck(EpassApplyStatus EpassStatus) throws ClassNotFoundException, SQLException, Exception {
			
		Connection connection = JDBCConnection.getConnection();// JDBC connectivity
		String query="insert into epassApplyStatus (application_no,applicant_name,aadhar_no,vaccination_certificate,status) values (?,?,?,?,?)";
	    PreparedStatement ps=connection.prepareStatement(query);
	    
	    ps.setLong(1, EpassStatus.getApplicationNo());
		ps.setString(2, EpassStatus.getApplicantName());
		ps.setLong(3, EpassStatus.getAadharNo());
		ps.setString(4, EpassStatus.getVaccinationCertificate());
		ps.setString(5, EpassStatus.getStatus());
		
		 int rows = ps.executeUpdate();
			System.out.println(rows);
			System.out.println("Values are Inserted");
			
		return query;
	
	}
}




