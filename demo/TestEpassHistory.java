package org.chainsys.demo;

import java.sql.SQLException;
import java.util.Scanner;

import org.chainsys.daoImpl.EpassHistoryImplement;
import org.chainsys.model.EpassHistory;
import org.chainsys.myexception.AadharNoException;
import org.chainsys.myexception.MobileNoException;
import org.chainsys.validation.UserValidation;

public class TestEpassHistory {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, AadharNoException, MobileNoException {
     
      EpassHistoryImplement epassImpl=new EpassHistoryImplement();
      EpassHistory history=new EpassHistory ();
	
	  UserValidation userValidation = new UserValidation();
    
      epassImpl.epassHistoryCheck();

		
	}

}
