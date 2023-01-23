package org.chainsys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.chainsys.E_pass.JDBCConnection;
import org.chainsys.dao.UserInterface;
import org.chainsys.model.User;

public class UserImplement implements UserInterface {

	@Override
	public String userRegister(User register) throws ClassNotFoundException, SQLException {
		
		Connection connection = JDBCConnection.getConnection();// JDBC connectivity
        //System.out.println(connection);
        String query = "insert into userDetails(aadhar_no,user_name,mail_id,password,mobile_no)values(?,?,?,?,?)";
        PreparedStatement pst = connection.prepareStatement(query);
        pst.setLong(1, register.getAadharNo());   //get the values
        pst.setString(2, register.getUserName());
        pst.setString(3, register.getMailId());
        pst.setString(4, register.getPassword());
        pst.setLong(5, register.getMobileNo());
      int rows = pst.executeUpdate();
    //    System.out.println(rows);// update status
    //    System.out.println("Values are Inserted");
           System.out.println("Register successfully");
		return null;

    }

	@Override
	public boolean loginUser(User login) throws ClassNotFoundException, SQLException, Exception {
            Connection connection =JDBCConnection.getConnection();
           Long aadharNo=login.getAadharNo();
           //System.out.println(adharNo);
           String password=login.getPassword();
         //  System.out.println(password);
           // System.out.println(connection);
            String query = "select aadhar_no,password from userDetails";

            PreparedStatement ps1 = connection.prepareStatement(query);
            ResultSet rs = ps1.executeQuery();// Retrieve the data
           // System.out.println(rs);
            while (rs.next()) {
                Long aNo= rs.getLong(1); //get the values
               
                String password1 = rs.getString(2);
              // System.out.println(password1+"password?");
              
                if((rs.getLong(1)==aadharNo)&&(rs.getString(2).equals(password))) {
                        
                	
                	return true;
                      
               }  
                
           }
      
            return false;
        }
	
	}
	

	
	
		

		



