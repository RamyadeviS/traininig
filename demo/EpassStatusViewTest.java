package org.chainsys.demo;

import java.sql.SQLException;
import java.util.Scanner;

import org.chainsys.daoImpl.EpassStatusViewImplement;
import org.chainsys.daoImpl.UserImplement;
import org.chainsys.model.EpassStatusView;
import org.chainsys.model.User;
import org.chainsys.myexception.AadharNoException;
import org.chainsys.myexception.ApplicantNameException;
import org.chainsys.myexception.ApplicationNoException;
import org.chainsys.myexception.PasswordException;
import org.chainsys.validation.UserValidation;


public class EpassStatusViewTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
		User user = new User();
		UserImplement userImp = new UserImplement();
		EpassStatusView login1=new EpassStatusView();
        EpassStatusViewImplement viewImpl=new  EpassStatusViewImplement();
        UserValidation userValidation = new UserValidation();
    
        Scanner scr=new Scanner(System.in);
        
	System.out.println("1.Login");
    //System.out.println("2.EpassView");
	String input = scr.nextLine();

	switch (input) {
	
	case "1":{
	
		System.out.println("enter the aadhar no");
		Long aadharNo1 = scr.nextLong();
		login1.setAadharNo(aadharNo1);
		user.setAadharNo(aadharNo1);
		System.out.println("enter the password");
		String password1 = scr.next();
		user.setPassword(password1);
		// userImp.loginUser(user);

	if (userImp.loginUser(user)) {
		System.out.println("Login successfully");
	
		 viewImpl.epassView(login1);
		} else {
			System.out.println("Login failed !!!!! Try Again");
			
		}

		break;

	}	

	}
}
}