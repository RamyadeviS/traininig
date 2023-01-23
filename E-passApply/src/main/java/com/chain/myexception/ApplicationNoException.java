package com.chain.myexception;

public class ApplicationNoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	{
	  System.out.println("invalid applicationNo!!!It doesn't have null values");
	}
}
