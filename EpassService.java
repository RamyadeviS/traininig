package com.epassproject.epassform.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.epassproject.epassform.dao.EpassDao;
import com.epassproject.epassform.model.AdminLogin;
import com.epassproject.epassform.model.EpassForm;
import com.epassproject.epassform.model.Register;
import com.epassproject.epassform.model.TravelEpassForm;
import com.epassproject.epassform.myexception.InvalidPwdException;

@Service
public class EpassService {

	@Autowired
	EpassDao registerDao;
	public void registerUser(Register register,HttpSession session) {
		registerDao.userRegister(register, session);
	}
	
	public void login(Register register,HttpSession session) throws InvalidPwdException {
		registerDao.userLogin(register, session);
	}
	
	public void loginAdmin(AdminLogin admin) throws InvalidPwdException {
		registerDao.adminLogin(admin);
	}
	
 public void epassFormApply(EpassForm epass,HttpSession session) {
	   registerDao.epassApplyForm(epass, session);
 }
 public void travelPassApply(TravelEpassForm travelPass,HttpSession session) {
      registerDao.travelPassApplyForm(travelPass, session);
 }		
 
 public void getEpassList(Model model) {
	
   List<EpassForm> registers=registerDao.listEpassform();
	model.addAttribute("List_Users", registers);
}
 public void getEpassApproveList(Model model) {
		
	   List<EpassForm> registers=registerDao.approveEpass();
		model.addAttribute("List_Approve", registers);
	}
 public void getEpassRejectList(Model model) {
		
	   List<EpassForm> registers=registerDao.rejectEpass();
		model.addAttribute("List_Reject", registers);
	}
	 
 public void getEpassPendingList(Model model) {
		
	   List<EpassForm> registers=registerDao.pendingEpass();
		model.addAttribute("List_Pending", registers);
	}
 
 public void getTravelpassList(Model model) {
	 List<TravelEpassForm> register=registerDao.listTravelPassForm();
   	 model.addAttribute("Travel_List", register);		
}
 public void getTravelPassApproveList(Model model) {
	 List<TravelEpassForm> register=registerDao.approveTravelPassForm();
   	 model.addAttribute("Travel_Approve", register);		
}
 public void getTravelPassRejectList(Model model) {
	 List<TravelEpassForm> register=registerDao.rejectTravelPassForm();
   	 model.addAttribute("Travel_Reject", register);
		
}
 public void getTravelPassPendingList(Model model) {
	 List<TravelEpassForm> register=registerDao.pendingTravelPassForm();
   	 model.addAttribute("Travel_Pending", register);
		
}
 
 public void epassApproved(EpassForm epass) {
  registerDao.epassStatusUpdate(epass);
}
 
 public void epassReject(EpassForm epass) {
	 registerDao.epassStatusReject(epass);
		
 }
 public void travelPassApproved(TravelEpassForm travelPass) {
	 registerDao.travelStatusApprove(travelPass);
 }
 public void travelPassReject(TravelEpassForm travelPass) {
	 registerDao.travelStatusReject(travelPass);
 }
 public void epassView(Long applicationNo,Model model,HttpSession session) {
	 List<EpassForm> epassList= registerDao.listEpassform();
		model.addAttribute("EpassStatus_List", epassList);
		
		String status=registerDao.userView(applicationNo);
		session.setAttribute("EpassStatus_List", status);
  }
 public void viwTravelPass(Long applicationNo,Model model,HttpSession session)  {
		List<TravelEpassForm> travelList= registerDao.listTravelPassForm();
		model.addAttribute("TravelStatus_List", travelList);
		
		String statusView=registerDao.travelPassView(applicationNo);
		session.setAttribute("TravelStatus_List", statusView);
 
 }
 
}
