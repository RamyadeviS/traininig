package org.chainsys.demo;

import java.sql.SQLException;
import java.util.Scanner;

import org.chainsys.daoImpl.AdminImplement;
import org.chainsys.daoImpl.TravelHistoryImplement;
import org.chainsys.model.Admin;
import org.chainsys.validation.UserValidation;

public class AdminTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
		
		Admin admin=new Admin();
		AdminImplement adminImpl=new AdminImplement();
		Scanner sc=new Scanner(System.in);
		UserValidation u=new  UserValidation ();
		
		System.out.println("1.Login"); 
		System.out.println("2.ListOfUser");
		System.out.println("3.UserList");
        String input=sc.next();
       
    	
		switch (input) {
	 
		case "1":
		
			System.out.println("Enter the mail id");
			String mailId=sc.next();
			admin.setMailId(mailId);
	        System.out.println("Enter the password");	
	        String password=sc.next();
		    admin.setPassword(password);
		    
		   adminImpl.validLogin(admin);
		  
		   
		    break;

		case"2":
			adminImpl.ListOfUser();
			break;
			
		case"3":
			adminImpl.userList();
			break;
			
			default:
				System.out.println("invalid choice");
	}
		}
		
		
	}



