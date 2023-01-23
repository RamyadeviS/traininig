package org.chainsys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.chainsys.E_pass.JDBCConnection;
import org.chainsys.dao.EpassHistoryInterface;
import org.chainsys.model.EpassHistory;
import org.chainsys.myexception.AadharNoException;
import org.chainsys.myexception.MobileNoException;
import org.chainsys.validation.UserValidation;

public class EpassHistoryImplement implements EpassHistoryInterface {

	EpassHistory history = new EpassHistory();
	UserValidation userValidation = new UserValidation();

	@Override
	public void epassHistoryCheck()throws ClassNotFoundException, SQLException, AadharNoException, MobileNoException {
		Connection connection = JDBCConnection.getConnection();// JDBC connectivity
		String query = "select aadhar_no,mobile_no from epassHistory";
		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();

		Scanner sc = new Scanner(System.in);

		System.out.println("1.passCreatedToday");
		System.out.println("2.passCreatedYesterday");
		System.out.println("3.passCreatedBeforeSevenDays");

	Integer input = sc.nextInt();

		switch (input) {

		case 1: 
			System.out.println("Enter the aadhar no"); // get the details from user Long
			Long aadharNo3 = sc.nextLong();
			userValidation.aadharNoValidation(aadharNo3);
			history.setAadharNo(aadharNo3); // set the values

			System.out.println("Enter the mobile no");
			Long mobileNo3 = sc.nextLong();
			userValidation.mobileNoValidation(mobileNo3);
			history.setMobileNo(mobileNo3);

			System.out.println("you are new user!!!");
			break;
		

		case 2: 
			System.out.println("Enter the aadhar no"); // get the details from user Long
			Long aadharNo1 = sc.nextLong();
			userValidation.aadharNoValidation(aadharNo1);
			history.setAadharNo(aadharNo1); // set the values

			System.out.println("Enter the mobile no");
			Long mobileNo1 = sc.nextLong();
			userValidation.mobileNoValidation(mobileNo1);
			history.setMobileNo(mobileNo1);

			System.out.println("you are applied the yesterday!!!");

			break;
		
	
		case 3:
			System.out.println("Enter the aadhar no"); // get the details from user Long
			Long aadharNo2 = sc.nextLong();
			userValidation.aadharNoValidation(aadharNo2);
			history.setAadharNo(aadharNo2); // set the values
			System.out.println("Enter the mobile no");
			Long mobileNo2 = sc.nextLong();
			userValidation.mobileNoValidation(mobileNo2);
			history.setMobileNo(mobileNo2);
			System.out.println("you were applied the e-pass seven days before!!!");

			break;
		
		default:

			System.out.println("invalid choice");
			break;
		}
		

	}

}
