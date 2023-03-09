package com.epassproject.epassform.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.epassproject.epassform.model.Register;

public class MailIdExistingMapper implements RowMapper <Register> {

		@Override
		public Register mapRow(ResultSet rs,int rowNum) throws SQLException {
	    Register register=new Register();
	    String mailId=rs.getString("mail_id");
	    register.setMailId(mailId);
	    return register;
		}
}
