package org.chainsys.dao;

import java.sql.SQLException;
import java.util.List;

import org.chainsys.model.Admin;
import org.chainsys.model.EpassApplyForm;

public interface AdminInterface {

	public boolean adminLogin(Admin login) throws ClassNotFoundException, SQLException, Exception;

	public List<EpassApplyForm> ListOfUser() throws ClassNotFoundException, SQLException;
    
}
