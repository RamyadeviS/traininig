package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@jakarta.servlet.annotation.WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public TestServlet() {
    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				try {
					Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
					System.out.println(connection);

			        String query = "insert into userDetails(aadhar_no,user_name,mail_id,password,mobile_no)values(?,?,?,?,?)";
			        PreparedStatement pst = connection.prepareStatement(query);
			     
			       /* String aadharNo=request.getParameter("AadharNo");
			        String userName=request.getParameter("NserName");
			        String password=request.getParameter("Password");
			        String mailId=request.getParameter("MailId");
			        String mobileNo=request.getParameter("MobileNo");*/
			        
			        pst.setString(1, request.getParameter("AadharNo")) ;  //get the values
			        pst.setString(2, request.getParameter("UserName"));
			        pst.setString(3, request.getParameter("MailId"));
			        pst.setString(4, request.getParameter("Password"));
			        pst.setString(5, request.getParameter("MobileNo"));
			        pst.executeUpdate();
			    //    System.out.println(rows);// update status
			    //    System.out.println("Values are Inserted");
			           System.out.println("Register successfully");	
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		String AadharNo = request.getParameter("AadharNo");
		PrintWriter writer = response.getWriter();
		writer.println("AadharNo:"+AadharNo);
		
		String UserName=request.getParameter("UserName");
		PrintWriter writer1 = response.getWriter();
		writer.println("UserName:"+UserName);
	  
		String Password=request.getParameter("MailId");
		PrintWriter writer2 = response.getWriter();
		writer.println("Password:"+Password);
		
		String MailId=request.getParameter("Password");
		PrintWriter writer3 = response.getWriter();
		writer.println("MailId:"+MailId);
		
		String MobileNo=request.getParameter("MobileNo");
		PrintWriter writer4 = response.getWriter();
		writer.println("MobileNo:"+MobileNo);
		//response.getWriter().append("Served at:TestServlet ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
	}

}
