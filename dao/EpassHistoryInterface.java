package org.chainsys.dao;

import java.sql.SQLException;

import org.chainsys.myexception.AadharNoException;
import org.chainsys.myexception.MobileNoException;

public interface EpassHistoryInterface {
     
	public void epassHistoryCheck() throws ClassNotFoundException, SQLException, AadharNoException, MobileNoException;
}
