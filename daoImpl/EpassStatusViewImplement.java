package org.chainsys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.chainsys.E_pass.JDBCConnection;
import org.chainsys.dao.EpassStatusViewInterface;
import org.chainsys.model.Admin;
import org.chainsys.model.EpassApplyForm;
import org.chainsys.model.EpassStatusView;
import org.chainsys.model.TravelHistory;

public class EpassStatusViewImplement implements EpassStatusViewInterface  {
	EpassStatusView login1=new EpassStatusView();
	@Override
	public boolean userLogin(long aadhar_no,String password) throws ClassNotFoundException, SQLException, Exception {
	
		  Connection connection =JDBCConnection.getConnection();
           String query = "select aadhar_no,password from userDetails";

           PreparedStatement ps1 = connection.prepareStatement(query);
           ResultSet rs = ps1.executeQuery();// Retrieve the data
          long adhaar=aadhar_no;
          String password1=password;
           while (rs.next()) {
        	   
               Long aadharNo1= rs.getLong(1); //get the values
              if(aadharNo1==aadhar_no) {
            	 String passwords=rs.getString(2);
            	 if(passwords.equals(password));{
     }
              }
                      
           }
           return false;
       }

	 public boolean validLogin(long aadhar_no,String password) throws Exception {
	        if(userLogin(aadhar_no,password)) {
	            System.out.println("Login successfully");
	        }
	        else {
	            System.out.println("Invalid mailId or password!!!Login failed");
	        }
			return false;
	        
	    }
	@Override
	public List <EpassStatusView> epassView(EpassStatusView userView) throws ClassNotFoundException, SQLException, Exception {
			Connection connection = JDBCConnection.getConnection();// JDBC connectivity
			String query ="select *from epassApplyStatus where aadhar_no=?";
   
			PreparedStatement pst=connection.prepareStatement(query);
			pst.setLong(1,userView.getAadharNo());
			ArrayList<EpassStatusView>list=new ArrayList<EpassStatusView>();
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				
			Long application_no=rs.getLong("application_no");
			String applicant_name=rs.getString("applicant_name");
			Long Aadhar_no=rs.getLong("aadhar_no");
		    String status=rs.getString("status");  
				
			login1.setApplicationNo(application_no);
			login1.setApplicantName(applicant_name);
			login1.setAadharNo(Aadhar_no);
			login1.setStatus(status);
			
		     list.add(login1);
			System.out.println(list);	
	
}
		return list;
		
			}
	
}

	
