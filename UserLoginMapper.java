package com.epassproject.epassform.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.epassproject.epassform.model.Register;

public class UserLoginMapper implements RowMapper<Register> {
    @Override    
	public Register mapRow(ResultSet rs,int rowNum) throws SQLException {
    Register register=new Register();
    
    String userName=rs.getString("user_name");
    register.setUserName(userName);
    
    String password=rs.getString("password");
    register.setPassword(password);
     return register;
}
}