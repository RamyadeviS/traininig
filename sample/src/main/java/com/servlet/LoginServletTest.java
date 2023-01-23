package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public LoginServletTest() {

    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
				System.out.println(connection);
				
				String aadharNo = request.getParameter("AadharNo");
				PrintWriter writer = response.getWriter();
				writer.println("AadharNo:"+aadharNo);
				
				String password = request.getParameter("Password");
				PrintWriter writer2 = response.getWriter();
				writer.println("Password:"+password);
				
				
				 String query = "select aadhar_no,password from userDetails where aadhar_no=?";
		            PreparedStatement ps1 = connection.prepareStatement(query);
		            ps1.setString(1,aadharNo);  //get the values
		            ResultSet rs = ps1.executeQuery();// Retrieve the data
		           
		      //  ps1.setString(3, request.getParameter("Password"));
		        while (rs.next()) {
	                String aNo= rs.getString(1); //get the values
	                //System.out.println(aNo);
	                String password1 = rs.getString(2);
	               // System.out.println(password1);
	              // System.out.println(password1+"password?");
	              
	                if((aNo.equals(aadharNo))&&(password1.equals(password)))
	                {
	                	HttpSession sess=request.getSession();
	                	sess.setAttribute("AadharNo",aadharNo);
	                    request.getRequestDispatcher("Sample.html").include(request, response);;
	                	System.out.println("Login successfully");
	                }
	                	else {
	                	 
	                	System.out.println ("Login failed!!!Invalid data");
	                	}
		        }
	       
			//	PrintWriter writer2 = response.getWriter();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	}


