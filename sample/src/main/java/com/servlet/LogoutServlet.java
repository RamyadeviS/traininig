package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LogoutServlet() {
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            HttpSession session = request.getSession(false);
            
            String n = (String) session.getAttribute("UserName");
            out.print("Hello" + n);
            System.out.println("User" + n);
            request.getRequestDispatcher("Login.html").forward(request, response);
            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
