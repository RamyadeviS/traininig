package com.epassproject.epassform.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.epassproject.epassform.model.AdminLogin;
import com.epassproject.epassform.model.EpassForm;
import com.epassproject.epassform.model.Register;
import com.epassproject.epassform.model.TravelEpassForm;
import com.epassproject.epassform.myexception.DuplicationOfAadharNoException;
import com.epassproject.epassform.myexception.DuplicationOfMailIdException;
import com.epassproject.epassform.myexception.InvalidPwdException;

public interface EpassInterface {

	
	public void userRegister(Register register,HttpSession session);
	public void mailIdExisting(String mailId) throws DuplicationOfMailIdException;
    public void aadharNoExisting(Register register) throws DuplicationOfAadharNoException;
    public boolean userLogin(Register register,HttpSession session) throws InvalidPwdException;
    
    public void epassApplyForm(EpassForm epass,HttpSession session);
    public void travelPassApplyForm(TravelEpassForm travelPass,HttpSession session);
 
    public void adminLogin(AdminLogin admin) throws InvalidPwdException;
   
    public List<EpassForm> listEpassform();
    public List<TravelEpassForm> listTravelPassForm();
   
    public void epassStatusUpdate(EpassForm epass);
    public void epassStatusReject(EpassForm epass);
   
    public void travelStatusApprove(TravelEpassForm travelPass);
    public void travelStatusReject(TravelEpassForm travelPass);
    
    public void userEpassView(EpassForm epass) ;
    public Integer totalEpassCount();
    public Integer totalTravelPassCount();
    public Integer totalUserCount();
    
    public String userView(Long applicationNo);
    public String travelPassView(Long applicationNo);
		 
}
