package org.chainsys.demo;

import java.sql.SQLException;
import java.util.Scanner;

import org.chainsys.daoImpl.TravelHistoryStatusImplement;
import org.chainsys.model.TravelEpassStatus;

public class TestTravelHistoryStatus {

public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
		
	   TravelEpassStatus travelStatus=new TravelEpassStatus();
	   TravelHistoryStatusImplement travelStatusImpl=new TravelHistoryStatusImplement();
		Scanner sc = new Scanner(System.in);

		System.out.println("1.Yes");
		System.out.println("2.No");

	    Integer input = sc.nextInt();

		switch (input) {

		case 1:  {
			System.out.println("Enter your application no");
			Long applicationNo=sc.nextLong();
			travelStatus.setApplicationNo(applicationNo);
			
			System.out.println("Enter your applicant name");
			String applicantName=sc.next();
			travelStatus.setApplicantName(applicantName);
			
			System.out.println("Enter your ticket no");
			String ticketNo=sc.next();
			travelStatus.setTicketNo(ticketNo);
			
			System.out.println("Enter your aadhar no");
			Long aadharNo=sc.nextLong();
			travelStatus.setAadharNo(aadharNo);
			
			System.out.println("Enter your vaccination certificate Status");
			String vaccinationCertificate=sc.next();
			travelStatus.setVaccinationCertificate(vaccinationCertificate);
			
			System.out.println("your E-pass is Approved");
		//	String Approved = null;
			travelStatus.setStatus("Approved");
			travelStatusImpl.TravelHistoryStatusCheck(travelStatus);
			
			
			break;
		}
			
		case 2:  {
			System.out.println("Enter your application no");
			Long applicationNo=sc.nextLong();
			travelStatus.setApplicationNo(applicationNo);
			
			System.out.println("Enter your applicant name");
			String applicantName=sc.next();
			travelStatus.setApplicantName(applicantName);
			
			System.out.println("Enter your ticket no");
			String ticketNo=sc.next();
			travelStatus.setTicketNo(ticketNo);
			
			System.out.println("Enter your aadhar no");
			Long aadharNo=sc.nextLong();
		    travelStatus.setAadharNo(aadharNo);
			
			System.out.println("Enter your vaccination certificate Status");
			String vaccinationCertificate=sc.next();
			travelStatus.setVaccinationCertificate(vaccinationCertificate);
			
			System.out.println("Vaccination certificate compulsory available");
			
		    System.out.println("Your E-pass application is Rejected");
		    travelStatus.setStatus("Rejected");
		     
		    travelStatusImpl.TravelHistoryStatusCheck(travelStatus);
				
			break;
		}
		

	}
	}

}
