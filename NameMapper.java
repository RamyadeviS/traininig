package com.epassproject.epassform.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.epassproject.epassform.model.Register;

public class NameMapper implements RowMapper<Register> {


	@Override
	public Register mapRow(ResultSet rs, int rowNum) throws SQLException {
		Register register=new Register();
	    rs.getString("user_name");
		register.getUserName();
		return register;
	}

}
