package com.epassproject.epassform.controller;

import java.io.FileInputStream;

import java.sql.Date;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.epassproject.epassform.dao.EpassDao;
import com.epassproject.epassform.model.AdminLogin;
import com.epassproject.epassform.model.EpassForm;
import com.epassproject.epassform.model.Register;
import com.epassproject.epassform.model.TravelEpassForm;
import com.epassproject.epassform.myexception.InvalidAadharNoException;
import com.epassproject.epassform.myexception.DuplicationOfAadharNoException;
import com.epassproject.epassform.myexception.DuplicationOfMailIdException;
import com.epassproject.epassform.myexception.InvalidMailIdException;
import com.epassproject.epassform.myexception.InvalidMobileNoException;
import com.epassproject.epassform.myexception.InvalidNameException;
import com.epassproject.epassform.myexception.InvalidPasswordException;
import com.epassproject.epassform.service.EpassService;
import com.epassproject.epassform.validation.ValidationUser;

@Controller
public class EpassController {
	
	@Autowired
	EpassDao registerDao;
	@Autowired
	EpassService epassService;
	Logger logger=LoggerFactory.getLogger(EpassController.class);
	//handler
	
	String adminDashboard="/jspfiles/AdminDashBoard.jsp";
	
	@RequestMapping("/")
	public String dash() {
		return "/jspfiles/Dashboard.jsp";
		
	}

	@RequestMapping("/welcome")
	public String welcome() {
		logger.info("through controller");
		return "/jspfiles/.UserDashBoard.css";
	}

	@PostMapping("/register")
	public String register(@RequestParam("AadharNo") Long aadharNo, @RequestParam("UserName") String userName ,
			@RequestParam("MailId") String mailId,@RequestParam("Password") String password, @RequestParam("MobileNo") Long mobileNo ,HttpSession session) throws DuplicationOfAadharNoException, InvalidAadharNoException, InvalidNameException, InvalidMailIdException, DuplicationOfMailIdException, InvalidPasswordException, InvalidMobileNoException {
	
		logger.info("Register successfully");
		Register register=new Register();
		
		ValidationUser valid =new ValidationUser();

		valid.aadharNoValidation(aadharNo);
		registerDao.aadharNoExisting(register);
		register.setAadharNo(aadharNo);
		
		ValidationUser.nameValidation(userName);
		register.setUserName(userName);
		
		 ValidationUser.mailIdValidation(mailId);
		 registerDao.mailIdExisting(mailId);
		 register.setMailId(mailId);
		 
		 ValidationUser.passwordValidation(password);
		 register.setPassword(password);
			 
		 valid.mobileNoValidation(mobileNo);
		 register.setMobileNo(mobileNo);
			 
		 epassService.registerUser(register, session);
		 return "/jspfiles/UserDashBoard.jsp";
		
		}
	
	@PostMapping("/userLogin")
	
	public String loginUser(@RequestParam("User Name") String userName, @RequestParam("Password") String password,HttpSession session) throws Exception  {
		logger.info("Login successfully");
		Register register=new Register();
		register.setUserName(userName);
		register.setPassword(password);
		epassService.login(register, session);
		 return "/jspfiles/UserDashBoard.jsp";
		
		
	}
@PostMapping("/AdminLogin")
	
	public String adminLogin(@RequestParam("Mail Id") String mailId, @RequestParam("Password") String password,Model model) throws Exception  {
	
	logger.info("through controller");
	AdminLogin admin=new AdminLogin();
		admin.setMailId(mailId);
		admin.setPassword(password);
		
		logger.info("Epass Count");
		Integer epassCount=registerDao.totalEpassCount();
		model.addAttribute("Epass_count", epassCount);
		
		logger.info("Travel Pass Count");
		Integer travelPassCount=registerDao.totalTravelPassCount();
		model.addAttribute("TravelPass_count", travelPassCount);
		
		logger.info("Epass total Count");
		Integer totalCount=registerDao.totalUserCount();
		model.addAttribute("TotalUser_count", totalCount);	
		
		logger.info("Epass Approve Count");
		Integer approveCount=registerDao.approvedCount();
		model.addAttribute("TotalApprove_count", approveCount);
		
		logger.info("Epass Reject Count");
		Integer rejectCount=registerDao.rejectedCount();
		model.addAttribute("TotalReject_count", rejectCount);
		
		logger.info("Approve Count");
		Integer travelApproveCount=registerDao.approveCount();
		model.addAttribute("TotalApprove_count1", travelApproveCount);
		
		logger.info("Reject Count");
		Integer travelRejectCount=registerDao.rejectCount();
		model.addAttribute("TotalReject_count1", travelRejectCount);
		
		logger.info("Epass Pending Count");
		Integer epassPendingCount=registerDao.pendingEpassCount();
		model.addAttribute("TotalPending_count", epassPendingCount);
		
		logger.info("Epass Pending Count");
		Integer travelPendingCount=registerDao.pendingCount();
		model.addAttribute("TotalPending_count1", travelPendingCount);
		
		epassService.loginAdmin(admin);
		return adminDashboard;	
		
	}
	
	@PostMapping("/EpassForm")
	public String epassForm(@RequestParam("ApplicantName") String applicantName,@RequestParam("AadharNo") Long aadharNo,
			@RequestParam("Gender") String gender,@RequestParam("Reason") String reason,@RequestParam("FatherName") String fatherName,@RequestParam("dob") Date dob,
			@RequestParam("FromDistrict") String fromDistrict,@RequestParam("ToDistrict") String toDistrict,
			@RequestParam("TravelDate") Date travelDate,@RequestParam("ReturnDate") Date returnDate,@RequestParam("NoOfPassengers") Integer noOfPassengers,
			@RequestParam("VehicleNo") String vehicleNo,@RequestParam("MobileNo") Long mobileNo, @RequestParam("VaccinationCertificate") String vaccinationCertificate,@RequestParam("image") MultipartFile image ,HttpSession session) throws Exception {
		
		logger.info("saving user records");
		EpassForm epass=new EpassForm();
		ValidationUser valid =new ValidationUser();
		
			ValidationUser.applicantNameValidation(applicantName);
			epass.setApplicantName(applicantName);
			
			valid.aadharNoValidation(aadharNo);
			epass.setAadharNo(aadharNo);
			
			valid.genderValidation(gender);
			epass.setGender(gender);
		
			epass.setReason(reason);
			
			ValidationUser.nameValidation(fatherName);
			epass.setFatherName(fatherName);
			
			valid.dobValidation(dob);
			epass.setDob(dob);
			
			ValidationUser.nameValidation(fromDistrict);
			epass.setFromDistrict(fromDistrict);
			
			ValidationUser.nameValidation(toDistrict);
			epass.setToDistrict(toDistrict);
			
			valid.dateValidation(travelDate);
			epass.setTravelDate(travelDate);
			
			valid.dateValidation(returnDate);
			epass.setReturnDate(returnDate);
			
			valid.noOfPassengersValidation(noOfPassengers);
			epass.setNoOfPassengers(noOfPassengers);
			
			ValidationUser.vehicleNoValidation(vehicleNo);
			epass.setVehicleNo(vehicleNo);
			
			valid.mobileNoValidation(mobileNo);	
			epass.setMobileNo(mobileNo);
			
			epass.setVaccinationCertificate(vaccinationCertificate);
		
			String fileName=image.getOriginalFilename();
			try(FileInputStream file = new FileInputStream("C:\\Users\\ramy3344\\eclipse-workspace\\E-pass\\src\\main\\webApp\\Images\\"+fileName);){
				byte[] images=file.readAllBytes();
				epass.setImage(images);
			}
			epassService.epassFormApply(epass, session);
		return "/jspfiles/ApplicationNo.jsp";
		}
	
	
	@GetMapping("/listEpassForm")
	
	public String getEpassFormUser(Model model,HttpSession session) {
		epassService.getEpassList(model);
		return "/jspfiles/UserListView.jsp";		
	}
	
	@GetMapping("/EpassApproveList")
	public String getEpassApproved(Model model,HttpSession session) {
		epassService.getEpassApproveList(model);
		return "/jspfiles/EpassApproveList.jsp";		
	}
	@GetMapping("/EpassRejectList")
	public String getEpassRejected(Model model,HttpSession session) {
		epassService.getEpassRejectList(model);
		return "/jspfiles/EpassRejectList.jsp";		
	}
	@GetMapping("/EpassPendingList")
	public String getEpassPending(Model model,HttpSession session) {
		epassService.getEpassPendingList(model);
		return "/jspfiles/EpassPendingList.jsp";		
	}
	

	@PostMapping("/TravelForm")
	public String travelForm(@RequestParam("ApplicantName")String applicantName,@RequestParam("Gender")String gender,@RequestParam("FatherName") String fatherName, @RequestParam("TicketNo")String ticketNo,@RequestParam("dob") Date dob,
			@RequestParam("AadharNo") Long aadharNo,@RequestParam("MobileNo") Long mobileNo,@RequestParam("Source")String source,@RequestParam("Destination")String destination,@RequestParam("TravelDate") Date travelDate,@RequestParam("ReturnDate") Date returnDate,@RequestParam("Reason") String reason,
			@RequestParam ("NoOfPassengers") Integer noOfPassengers,@RequestParam("VaccinationCertificate") String vaccinationCertificate,@RequestParam("image") MultipartFile image ,HttpSession session) throws Exception {
		
		logger.info("saving user records");
		TravelEpassForm travelPass=new TravelEpassForm();
		ValidationUser valid =new ValidationUser();
		
	     ValidationUser.applicantNameValidation(applicantName);
		 travelPass.setApplicantName1(applicantName);
		 
		 valid.genderValidation(gender);
		 travelPass.setGender1(gender);
		 
		 ValidationUser.nameValidation(fatherName);
		 travelPass.setFatherName1(fatherName);
		 
		 ValidationUser.ticketNoValidation(ticketNo);
		 travelPass.setTicketNo(ticketNo);
		 
		 valid.dobValidation(dob);
		 travelPass.setDateOfBirth(dob);
		 
		 valid.aadharNoValidation(aadharNo);
		 travelPass.setAadharNumber(aadharNo);
		 
		 valid.mobileNoValidation(mobileNo);
		 travelPass.setPhoneNumber(mobileNo);
		
		 ValidationUser.placeValidation(source);
		 travelPass.setSource(source);
		 
		 ValidationUser.placeValidation(destination);
		 travelPass.setDestination(destination);
		 
		 valid.dateValidation(travelDate);
		 travelPass.setFromDate(travelDate);
		 
		 valid.dateValidation(returnDate);
		 travelPass.setToDate(returnDate);
		 
		 travelPass.setReasons(reason);
		 
		 valid.noOfPassengersValidation(noOfPassengers);
		 travelPass.setPassengers(noOfPassengers);
		 
		 travelPass.setCovidCertificate(vaccinationCertificate);
		 
		 String fileName=image.getOriginalFilename();
			try(FileInputStream file = new FileInputStream("C:\\Users\\ramy3344\\eclipse-workspace\\E-pass\\src\\main\\webApp\\Images\\"+fileName);){
			
				byte[] images=file.readAllBytes();
				 travelPass.setImages(images);
			}
			epassService.travelPassApply(travelPass, session);
		return "/jspfiles/ApplicationStatus.jsp";
	
}
@GetMapping("/listTravelPass")
	
	public String getListTravelPass(Model model,HttpSession session) {
	  epassService.getTravelpassList(model);
		return "/jspfiles/ListOfTravelOPass.jsp";
		
	}

@GetMapping("/TravelPassApprove")
public String getListTravelPassApprove(Model model,HttpSession session) {
  epassService.getTravelPassApproveList(model);
	return "/jspfiles/TravelPassApprove.jsp";	
}


@GetMapping("/TravelPassReject")
public String getListTravelPassReject(Model model,HttpSession session) {
  epassService.getTravelPassRejectList(model);
	return "/jspfiles/TravelPassReject.jsp";
	}


@GetMapping("/TravelPassPending")
public String getListTravelPassPending(Model model,HttpSession session) {
  epassService.getTravelPassPendingList(model);
	return "/jspfiles/TravelPassPending.jsp";
	
}

@PostMapping("/update")
public String updateStatus(@RequestParam("checkbox") Long applicationNo) {
	logger.info("to update the status");
	EpassForm epass=new EpassForm();
	epass.setApplicationNo(applicationNo);
	epassService.epassApproved(epass);
	return adminDashboard;	
}
@PostMapping("/reject")
    public String rejectStatus(@RequestParam("checkbox") Long applicationNo) {
	logger.info("To reject the status");
	EpassForm epass=new EpassForm();
	epass.setApplicationNo(applicationNo);
	epassService.epassReject(epass);
	return "/jspfiles/Admin.jsp";
	
}

@PostMapping("/Approve")
public String approvedStatus(@RequestParam("checkbox") Long applicationNo) {
	logger.info("To update the status");
	TravelEpassForm travelPass=new TravelEpassForm();
    travelPass.setApplicationNumber(applicationNo);
	epassService.travelPassApproved(travelPass);
	return "/jspfiles/AdminDashBoard.jsp";
	
}

@PostMapping("/Reject")
public String travelRejectStatus(@RequestParam("checkbox") Long applicationNo) {
	logger.info("To update the status");
	TravelEpassForm travelPass=new TravelEpassForm();
    travelPass.setApplicationNumber(applicationNo);
	epassService.travelPassReject(travelPass);
	return adminDashboard;
} 

@PostMapping("/userView")
public String userView(@RequestParam("search") Long applicationNo,Model model,HttpSession session) {
	logger.info("To get the status");
	epassService.epassView(applicationNo, model, session);
	return "/jspfiles/ApplicationNo.jsp";
	
}

@PostMapping("/travelView")
public String view(@RequestParam("search") Long applicationNo,Model model,HttpSession session)  {
	logger.info("To get the status");
	epassService.viwTravelPass(applicationNo, model, session);
	return "/jspfiles/ApplicationStatus.jsp";
	
}

@PostMapping("/forgot")
public String updatePassword(@RequestParam("MailId") String mail,@RequestParam("Password") String password) {
	
	Register register=new Register();
	logger.info("update password"); 
	register.setMailId(mail);
	register.setPassword(password);
	register.setPassword(password);
	registerDao.forgotPassword(register);
	return "/jspfiles/EpassForm.jsp"; 
    
}
}
