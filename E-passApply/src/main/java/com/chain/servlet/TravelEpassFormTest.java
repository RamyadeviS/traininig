package com.chain.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chain.model.TravelEpassForm;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/TravelEpassFormTest")
public class TravelEpassFormTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
     TravelEpassForm travelEass=new TravelEpassForm();
    public TravelEpassFormTest() {
        super();
        
    }

	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String applicationNo =request.getParameter("ApplicationNo");
		response.getWriter();
		travelEass.setApplicationNo(applicationNo);
		
		String applicantName =request.getParameter("ApplicantName");
		response.getWriter();
		epassForm.setAadharNo(applicantName);
		
		String aadharNo = request.getParameter("AadharNo");
		response.getWriter();
		epassForm.setAadharNo(aadharNo);
		
		String gender =request.getParameter("Gender");
		response.getWriter();
		epassForm.setGender(gender);
		
		String reason =request.getParameter("Reason");
		response.getWriter();
		epassForm.setReason(reason);
		
		String fatherName =request.getParameter("FatherName");
		response.getWriter();
		epassForm.setFatherName(fatherName);
		
		String dob =request.getParameter("Dob");
		response.getWriter();
		epassForm.setDob(dob);
		
		String fromDistrict =request.getParameter("FromDistrict");
		response.getWriter();
		epassForm.setFromDistrict(fromDistrict);
		
		String toDistrict =request.getParameter("ToDistrict");
		response.getWriter();
		epassForm.setToDistrict(toDistrict);
		
		String state =request.getParameter("State");
		response.getWriter();
		epassForm.setState(state);
		
		String travelDate=request.getParameter("TravelDate");
		response.getWriter();
		epassForm.setTravelDate(travelDate);
		
		String noOfPassengers =request.getParameter("NoOfPassengers");
		response.getWriter();
		epassForm.setNoOfPassengers(noOfPassengers);
		
		String vehicleNo =request.getParameter("VehicleNo");
		response.getWriter();
		epassForm.setVehicleNo(vehicleNo);
		
		String mobileNo =request.getParameter("MobileNo");
		response.getWriter();
		epassForm.setMobileNo(mobileNo);
		
		String vaccinationCertificate =request.getParameter("VaccinationCertificate ");
		response.getWriter();
		epassForm.setVaccinationCertificate(vaccinationCertificate);
			
		String returnDate =request.getParameter("ReturnDate");
		response.getWriter();
		epassForm.setReturnDate(returnDate);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
				System.out.println(connection);
				
				String query = "insert into epassApply (application_no,applicant_name,aadhar_no,"
						+ "gender,reason,father_name,dob,from_district,to_district,state,"
						+ "travel_date,no_of_passengers,vehicle_no,mobile_no,"
						+ "vaccination_certificate,return_date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps =connection.prepareStatement(query);
				ps.setString(1, epassForm.getApplicationNo());
				ps.setString(2, epassForm.getApplicantName());
				ps.setString(3, epassForm.getAadharNo());
				ps.setString(4, epassForm.getGender());
				ps.setString(5, epassForm.getReason());
				ps.setString(6, epassForm.getFatherName());
				ps.setString(7, epassForm.getDob());
				ps.setString(8, epassForm.getFromDistrict());
				ps.setString(9, epassForm.getToDistrict());
				ps.setString(10,epassForm.getState());
				ps.setString(11,epassForm.getTravelDate());
				ps.setString(12,epassForm.getNoOfPassengers());
				ps.setString(13,epassForm.getVehicleNo());
				ps.setString(14,epassForm.getMobileNo());
				ps.setString(15,epassForm.getVaccinationCertificate());
				ps.setString(16,epassForm.getReturnDate());
				
			    ResultSet rs = ps.executeQuery();// Retrieve the data
		        System.out.println("rows inserted");   
		        
		        request.getRequestDispatcher("HomePage.jsp").forward(request, response);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	} */

}
