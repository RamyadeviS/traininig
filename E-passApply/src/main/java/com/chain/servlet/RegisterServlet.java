package com.chain.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.chainsys.validation.UserValidation;

import com.chain.model.Register;
import com.chain.myexception.AadharNoException;
import com.chain.myexception.MailIdException;
import com.chain.myexception.MobileNoException;
import com.chain.myexception.NameException;
import com.chain.myexception.PasswordException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	Register register = new Register();
	private static final long serialVersionUID = 1L;

	UserValidation userValid = new UserValidation();

	public RegisterServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String aadharNo = request.getParameter("AadharNo");
		response.getWriter();
		Long aNo = Long.parseLong(aadharNo);
		register.setAadharNo(aNo);
        try {
			userValid.aadharNoValidation(aNo);
			String userName = request.getParameter("UserName");
	        response.getWriter();
	        register.setUserName(userName);
	        
	        try {
				userValid.nameValidation(userName);
				
				String mailId = request.getParameter("MailId");
				response.getWriter();
				register.setMailId(mailId);
		        try {
					userValid.mailIdValidation(mailId);
					
					String password = request.getParameter("Password");
					response.getWriter();
					register.setPassword(password);
					try {
						userValid.passwordValidation(password);
						
						String mobileNo = request.getParameter("MobileNo");
						response.getWriter();
						Long mNo = Long.parseLong(mobileNo);
						register.setMobileNo(mNo);
				        try {
							userValid.mobileNoValidation(mNo);
							
							try {
								Class.forName("oracle.jdbc.driver.OracleDriver");
								try {
									Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system",
											"oracle");
									System.out.println(connection);

									String query = "insert into userDetails(aadhar_no,user_name,mail_id,password,mobile_no)values(?,?,?,?,?)";
									PreparedStatement pst = connection.prepareStatement(query);

									pst.setLong(1, register.getAadharNo());
									pst.setString(2, register.getUserName());
									pst.setString(3, register.getMailId());
									pst.setString(4, register.getPassword());
									pst.setLong(5, register.getMobileNo());
									pst.executeUpdate();
									// System.out.println(rows);// update status
									// System.out.println("Values are Inserted");
									System.out.println("Register successfully");
								} catch (SQLException e) {
									e.printStackTrace();
								}
							} catch (ClassNotFoundException e) {
								e.printStackTrace();
							}
						} catch (MobileNoException e1) {
							e1.printStackTrace();
						}
					} catch (PasswordException e1) {
						e1.printStackTrace();
					}
				} catch (MailIdException e1) {
					e1.printStackTrace();
				}
			} catch (NameException e2) {
				e2.printStackTrace();
			}
		} catch (AadharNoException e1) {
			e1.printStackTrace();
		}
   // response.getWriter().append("Served at: ").append(request.getContextPath());

	}

}
