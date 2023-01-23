package org.chainsys.dao;

import java.sql.SQLException;
import java.util.List;

import org.chainsys.model.EpassStatusView;
import org.chainsys.model.User;

public interface EpassStatusViewInterface {

	
	 public	List<EpassStatusView> epassView(EpassStatusView userView) throws ClassNotFoundException, SQLException, Exception;
	 public boolean userLogin(long aadhar_no,String password) throws ClassNotFoundException, SQLException, Exception;
}
