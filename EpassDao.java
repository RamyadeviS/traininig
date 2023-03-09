package com.epassproject.epassform.dao;

import java.util.List;


import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCountCallbackHandler;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.epassproject.epassform.mapper.AadharNoMapper;
import com.epassproject.epassform.mapper.AdminLoginMapper;
import com.epassproject.epassform.mapper.EpassFormMapper;
import com.epassproject.epassform.mapper.MailIdExistingMapper;
import com.epassproject.epassform.mapper.NameMapper;
import com.epassproject.epassform.mapper.RegisterMapper;
import com.epassproject.epassform.mapper.TravelEpassFormMapper;
import com.epassproject.epassform.mapper.UserLoginMapper;
import com.epassproject.epassform.model.AdminLogin;
import com.epassproject.epassform.model.EpassForm;
import com.epassproject.epassform.model.Register;
import com.epassproject.epassform.model.TravelEpassForm;
import com.epassproject.epassform.myexception.DuplicationOfAadharNoException;
import com.epassproject.epassform.myexception.DuplicationOfMailIdException;
import com.epassproject.epassform.myexception.InvalidPwdException;
@Repository
public class EpassDao implements EpassInterface {
	@Autowired
	JdbcTemplate jdbcTemplate;
	Logger logger=LoggerFactory.getLogger(EpassDao.class);
		//crud-DB activities
	
public void userRegister(Register register,HttpSession session) {
   logger.info("To register Epass");  
   String user="insert into userDetails1(aadhar_no,user_name,mail_id,password,mobile_no)values(?,?,?,?,?)";
   Object[] params= {register.getAadharNo(),register.getUserName(),register.getMailId(),register.getPassword(),register.getMobileNo()};
   jdbcTemplate.update(user,params);
   session.setAttribute("UserName",register.getUserName());
   session.setAttribute("AadharNo", register.getAadharNo());
 }
  public void mailIdExisting(String mailId) throws DuplicationOfMailIdException {
	  Register register=new Register();
	  register.getMailId();
	 
	String query="select mail_id from userDetails1";
	List<Register> regList=jdbcTemplate.query(query, new MailIdExistingMapper());
	for(Register registers :regList) {
		String email=registers.getMailId();
		logger.info(email);
		
		if(email.equals(mailId)) {
			
			throw new DuplicationOfMailIdException();
		}
		else {
			logger.info("Continue");	
		}
	}

  }
  public void aadharNoExisting(Register register) throws DuplicationOfAadharNoException {
		Long aadharNo =register.getAadharNo();
		String query="select aadhar_no from userDetails1";
		List<Register> regList=jdbcTemplate.query(query, new AadharNoMapper());
		for(Register registers :regList) {
			Long aNo=registers.getAadharNo();
			if(aNo.equals(aadharNo)) {
				throw new DuplicationOfAadharNoException();
				}
			else
				logger.info("Continue");
		}
  }
  
  public boolean userLogin(Register register,HttpSession session) throws InvalidPwdException {
	
	  String userName=register.getUserName();
	  String password=register.getPassword();
	   
	  logger.info("To Login user");
	  String query="select user_name,password from userDetails1 where user_name=?";
	  List<Register> userList = jdbcTemplate.query(query, new UserLoginMapper(),userName);
	  
	  session.setAttribute("UserName", register.getUserName());
	  for(Register userLi:userList) {
		userLi.getUserName();
		  String pwd=userLi.getPassword();
		
		  if(pwd.equals(password)) {
			  logger.info("Login Successfully");
		  }
				 
		  else {
			 throw new InvalidPwdException();
		  }
		  
	  }
	return true;
	}
  
  public void epassApplyForm(EpassForm epass,HttpSession session) {
	  logger.info("To apply Epass");
	  String apply="insert into epassApply(applicant_name,aadhar_no,gender,reason,father_name ,dob, from_district ,to_district ,state ,travel_date ,return_date,no_of_passengers ,vehicle_no, mobile_no ,vaccination_certificate,status,Certificate_image)values(?,?,?,?,?,?,?,?,'Tamilnadu',?,?,?,?,?,?,'Pending',?)";
	  
	  logger.info(apply);
	  Object[] params= {epass.getApplicantName(),epass.getAadharNo(),epass.getGender(),epass.getReason(),epass.getFatherName(),epass.getDob(),epass.getFromDistrict(),epass.getToDistrict(),epass.getTravelDate(),epass.getReturnDate(),epass.getNoOfPassengers(),epass.getVehicleNo(),epass.getMobileNo(),epass.getVaccinationCertificate(),epass.getImage()};
	  jdbcTemplate.update(apply,params);
	  session.setAttribute("UserName",epass.getApplicantName());
	  session.setAttribute("AadharNo",epass.getAadharNo());
  }
  
  public void travelPassApplyForm(TravelEpassForm travelPass,HttpSession session) {
	  logger.info("To apply Epass");
	  String travelPassApply="insert into travelHistory(applicant_name,gender,father_name,ticket_no,dob,aadhar_no,mobile_no,source,destination,travel_date,return_date,reason,no_of_passengers,vaccination_certificate,status,Certificate_image)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,'Pending',?)";
	  Object []params= {travelPass.getApplicantName1(),travelPass.getGender1(),travelPass.getFatherName1(),travelPass.getTicketNo(),travelPass.getDateOfBirth(),travelPass.getAadharNumber(),travelPass.getPhoneNumber(),travelPass.getSource(),travelPass.getDestination(),travelPass.getFromDate(),travelPass.getToDate(),travelPass.getReasons(),travelPass.getPassengers(),travelPass.getCovidCertificate(),travelPass.getImages()};
	  jdbcTemplate.update(travelPassApply,params);
	  session.setAttribute("UserName",travelPass.getApplicantName1());
	  session.setAttribute("AadharNo",travelPass.getAadharNumber());
  }
 
  public void adminLogin(AdminLogin admin) throws InvalidPwdException {
      String mailId=admin.getMailId();
      String pass=admin.getPassword();
    		  
      logger.info("To Login Admin");
		  if(!mailId.equals("admin@gmail.com'")) {
        	   String input="admin712";
               if(!pass.equals(input)) {
            	   throw new InvalidPwdException();
               }
               else 
                   logger.info("Login Successfully!!!...");
                  
           }
          
}

public List<EpassForm> listEpassform() {
	String sql="Select application_no, applicant_name,aadhar_no ,gender,reason,father_name ,dob, from_district ,to_district ,state ,travel_date ,return_date,no_of_passengers ,vehicle_no, mobile_no ,vaccination_certificate,status,Certificate_image from epassApply";
	return jdbcTemplate.query(sql,new EpassFormMapper());
}

public List<EpassForm> approveEpass()  {
	String sql="Select application_no, applicant_name,aadhar_no ,gender,reason,father_name ,dob, from_district ,to_district ,state ,travel_date ,return_date,no_of_passengers ,vehicle_no, mobile_no ,vaccination_certificate,status,Certificate_image from epassApply where status='Approved'";
	return jdbcTemplate.query(sql,new EpassFormMapper());
}

public List<EpassForm> rejectEpass()  {
	String sql="Select application_no, applicant_name,aadhar_no ,gender,reason,father_name ,dob, from_district ,to_district ,state ,travel_date ,return_date,no_of_passengers ,vehicle_no, mobile_no ,vaccination_certificate,status,Certificate_image from epassApply where status='Rejected'";
	return jdbcTemplate.query(sql,new EpassFormMapper());
}
public List<EpassForm> pendingEpass()  {
	String sql="Select application_no, applicant_name,aadhar_no ,gender,reason,father_name ,dob, from_district ,to_district ,state ,travel_date ,return_date,no_of_passengers ,vehicle_no, mobile_no ,vaccination_certificate,status,Certificate_image from epassApply where status='Pending'";
	return jdbcTemplate.query(sql,new EpassFormMapper());
}

public List<TravelEpassForm> listTravelPassForm() {
	String sql="Select application_no,applicant_name,gender,father_name,ticket_no,dob,aadhar_no,mobile_no,source,destination,travel_date,return_date,reason,no_of_passengers,vaccination_certificate,status,Certificate_image from travelHistory";
	return jdbcTemplate.query(sql,new TravelEpassFormMapper());
}

public List<TravelEpassForm> approveTravelPassForm() {
	String sql="Select application_no,applicant_name,gender,father_name,ticket_no,dob,aadhar_no,mobile_no,source,destination,travel_date,return_date,reason,no_of_passengers,vaccination_certificate,status,Certificate_image from travelHistory where status='Approved'";
	return jdbcTemplate.query(sql,new TravelEpassFormMapper());
}

public List<TravelEpassForm> rejectTravelPassForm() {
	String sql="Select application_no,applicant_name,gender,father_name,ticket_no,dob,aadhar_no,mobile_no,source,destination,travel_date,return_date,reason,no_of_passengers,vaccination_certificate,status,Certificate_image from travelHistory where status='Rejected'";
	return jdbcTemplate.query(sql,new TravelEpassFormMapper());
}

public List<TravelEpassForm> pendingTravelPassForm() {
	String sql="Select application_no,applicant_name,gender,father_name,ticket_no,dob,aadhar_no,mobile_no,source,destination,travel_date,return_date,reason,no_of_passengers,vaccination_certificate,status,Certificate_image from travelHistory where status='Pending'";
	return jdbcTemplate.query(sql,new TravelEpassFormMapper());
}




public void epassStatusUpdate(EpassForm epass) {
	  logger.info("To Approve Epass");
	  String updateStatus ="update epassApply set status='Approved'where application_no=?";
	  Object[] params= {epass.getApplicationNo()};
jdbcTemplate.update(updateStatus, params);
}

public void epassStatusReject(EpassForm epass) {
	logger.info("To Reject Epass");
	String updateStatus ="update epassApply set status='Rejected' where application_no=?";
	Object[] params= {epass.getApplicationNo()};
	jdbcTemplate.update(updateStatus, params);
} 

public void travelStatusApprove(TravelEpassForm travelPass) {
	  logger.info("To Approve Travel Pass");
	  String status ="update travelHistory set status='Approved' where application_no=?";
	  Object[] params= {travelPass.getApplicationNumber()};
jdbcTemplate.update(status, params);
}
public void travelStatusReject(TravelEpassForm travelPass) {
	logger.info("To Reject Travel Pass");
	String status ="update travelHistory set status='Rejected' where application_no=?";
	Object[] params= {travelPass.getApplicationNumber()};
	jdbcTemplate.update(status, params);
} 
public void userEpassView(EpassForm epass) {
  logger.info("To view the Epass");
  String epassView="Select application_no, applicant_name,aadhar_no ,gender,reason,father_name ,dob, from_district ,to_district ,state ,travel_date ,return_date,no_of_passengers ,vehicle_no, mobile_no ,vaccination_certificate,status from epassApply where application_no=?,status=?";
  Object[] params= {epass.getApplicationNo(),epass.getStatus()};
  jdbcTemplate.update(epassView, params);
	
}

public Integer totalEpassCount() {
    String sql = "SELECT COUNT(*) FROM epassApply";
    return jdbcTemplate.queryForObject(sql,Integer.class);

}
public Integer totalTravelPassCount() {
    String sql = "SELECT COUNT(*) FROM travelHistory";
    return jdbcTemplate.queryForObject(sql,Integer.class);

}
public Integer totalUserCount() {
    String sql = "select (select count(*) from epassApply) + (select count(*) from travelHistory) sum from dual";
    return jdbcTemplate.queryForObject(sql,Integer.class);

}

public Integer approvedCount() {
    String sql="Select count(*) status from  epassApply where status = 'Approved'";
    return jdbcTemplate.queryForObject(sql,Integer.class);

}

public Integer rejectedCount() {
    String sql1="Select count(*) status from  epassApply where status = 'Rejected'";
    return jdbcTemplate.queryForObject(sql1,Integer.class);

}

public Integer approveCount() {
    String sql="Select count(*) status from  travelHistory where status = 'Approved'";
    return jdbcTemplate.queryForObject(sql,Integer.class);

}

public Integer rejectCount() {
    String sql1="Select count(*) status from  travelHistory where status = 'Rejected'";
    return jdbcTemplate.queryForObject(sql1,Integer.class);

}

public Integer pendingEpassCount() {
	 String sql="Select count(*) status from  epassApply where status = 'Pending'";

    return jdbcTemplate.queryForObject(sql,Integer.class);

}

public Integer pendingCount() {
    String sql="Select count(*) status from  travelHistory where status = 'Pending'";
    return jdbcTemplate.queryForObject(sql,Integer.class);

}

public String userView(Long applicationNo)  {
	String sql="select status from epassApply where application_no=?";
	String queryForObject=null;
	try {
		queryForObject=jdbcTemplate.queryForObject(sql, String.class, applicationNo);
	}catch
	
	(EmptyResultDataAccessException e) {
		logger.info("View");
	}
	return queryForObject;
	
}

public String travelPassView(Long applicationNo)  {
	String sql="select status from travelHistory where application_no=?";
	String queryForObject=null;
	try {
		queryForObject=jdbcTemplate.queryForObject(sql, String.class, applicationNo);
	}catch
	
	(EmptyResultDataAccessException e) {
		logger.info("View");
	}
	return queryForObject;
	
}
public void forgotPassword(Register register) {
	logger.info("update password");
	String pass1=register.getPassword();
	String pass2=register.getPassword();
	if(pass1.equals(pass2)) {
		String query="update userDetails1 set password=? where mail_id=?";
		Object[] upd= {register.getPassword(),register.getMailId()};
		jdbcTemplate.update(query, upd);
		logger.info("Row updated");
}
	else {
		logger.info("Password does not match");
	}
}

}
