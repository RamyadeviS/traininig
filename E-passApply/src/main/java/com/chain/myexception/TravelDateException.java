package com.chain.myexception;

public class TravelDateException extends Exception {

	{
		System.out.println("Invalid travel date!! travel date match a date in dd/mm/yyyy or dd-mm-yyyy format");
	}
}
