package org.chainsys.dao;

import java.sql.SQLException;
import java.util.List;

import org.chainsys.model.User;

public interface UserInterface {
	public String userRegister(User register) throws ClassNotFoundException, SQLException;
    public boolean loginUser(User login)throws ClassNotFoundException, SQLException, Exception;
	
}