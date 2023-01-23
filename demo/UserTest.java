package org.chainsys.demo;

import java.util.List;
import java.util.Scanner;

import org.chainsys.daoImpl.UserImplement;
import org.chainsys.model.User;
import org.chainsys.validation.UserValidation;

public class UserTest {
          
	public static void main(String[] args) throws Exception {
		UserImplement userImp = new UserImplement(); // implement object
		User user = new User(); // POJO object
		Scanner sc = new Scanner(System.in);
		UserValidation userValidation = new UserValidation();
                   
		System.out.println(" 1.Register");
		System.out.println(" 2.Login");
		//System.out.println("please choose available option");
		String input = sc.nextLine();
	
		switch (input) {
		  
		// performing user input
		case "1":
			
			  System.out.println("Enter the aadhar no"); //get the details from user Long
			  Long aadharNo=sc.nextLong();
			  userValidation.aadharNoValidation(aadharNo);
			  user.setAadharNo(aadharNo);//set the values
			 
			 System.out.println("enter the user name");//get the details from user String
			 String userName = sc.next(); 
			 userValidation.nameValidation(userName);
			 user.setUserName(userName);
			 // set the values

			System.out.println("Enter the mailId");// get the details from user
			String mailId = sc.next();
			user.setMailId(mailId);// set the values
			userValidation.mailIdValidation(mailId);
			userValidation.existingmailIdValidation(mailId);

			System.out.println("Enter the password");// get the details from user
			String password = sc.next();
			userValidation.passwordValidation(password);
			user.setPassword(password);// set the values

			System.out.println("Enter the mobileNo");// get the details from user
			Long mobileNo = sc.nextLong();
			userValidation.mobileNoValidation(mobileNo);
			user.setMobileNo(mobileNo); // set the values

			userImp.userRegister(user);
			break;

		case "2":
			System.out.println("enter the aadhar no");
			Long aadharNo1 = sc.nextLong();
			user.setAadharNo(aadharNo1);
			System.out.println("enter the password");
			String password1 = sc.next();

			user.setPassword(password1);
			// userImp.loginUser(user);

		if (userImp.loginUser(user)) {
			System.out.println("Login successfully");
			System.out.println("*you can view the list of reasons!!!And choose any one reasons*");
			System.out.println("You can apply the E-pass");
			} else {
				System.out.println("Login failed !!!!! Try Again");
				
			}

			break;

	}
     
	}
}

	