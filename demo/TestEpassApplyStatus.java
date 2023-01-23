package org.chainsys.demo;

import java.sql.SQLException;
import java.util.Scanner;
import org.chainsys.daoImpl.EpassApplyStatusImplement;
import org.chainsys.model.EpassApplyStatus;

public class TestEpassApplyStatus {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
		
		EpassApplyStatus Status=new  EpassApplyStatus();
		EpassApplyStatusImplement passImpl=new EpassApplyStatusImplement();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1.Yes");
		System.out.println("2.No");

	    Integer input = sc.nextInt();

		switch (input) {

		case 1:  {
			System.out.println("Enter your application no");
			Long applicationNo=sc.nextLong();
			Status.setApplicationNo(applicationNo);
			
			System.out.println("Enter your applicant name");
			String applicantName=sc.next();
			Status.setApplicantName(applicantName);
			
			System.out.println("Enter your aadhar no");
			Long aadharNo=sc.nextLong();
			Status.setAadharNo(aadharNo);
			
			System.out.println("Enter your vaccination certificate Status");
			String vaccinationCertificate=sc.next();
			Status.setVaccinationCertificate(vaccinationCertificate);
			
			System.out.println("your E-pass is Approved");
		//	String Approved = null;
			Status.setStatus("Approved");
			
			passImpl.epassApplyStatusCheck(Status);
			
			break;
		}
			
		case 2:  {
			System.out.println("Enter your application no");
			Long applicationNo=sc.nextLong();
			Status.setApplicationNo(applicationNo);
			
			System.out.println("Enter your applicant name");
			String applicantName=sc.next();
			Status.setApplicantName(applicantName);
			
			System.out.println("Enter your aadhar no");
			Long aadharNo=sc.nextLong();
			Status.setAadharNo(aadharNo);
			
			System.out.println("Enter your vaccination certificate Status");
			String vaccinationCertificate=sc.next();
			
			System.out.println("Vaccination certificate compulsory available");
			Status.setVaccinationCertificate(vaccinationCertificate);
				
		     System.out.println("Your E-pass application is Rejected");
		     Status.setStatus("Rejected");
		     
		     passImpl.epassApplyStatusCheck(Status);
				
			break;
		}
		

	}
	}
}
