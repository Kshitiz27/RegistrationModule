package com.registrationmodule.servlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrationmodule.dao.userdao;
import com.registrationmodule.dbconnect.dbconnection;
import com.registrationmodule.entity.student;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
  protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
    	
    	PrintWriter out = response.getWriter();
    	
    	String userEmail=request.getParameter("email");
    	String userPassword =  request.getParameter("password");
    	
    	
    	userdao dao= new userdao(dbconnection.getconnection());
    	student u=dao.getuserbyemailandpassword(userEmail, userPassword);
    	
    	if(u==null) {
    	out.println("User not registered....");
    	}
    	else {
    		//login successfull
    		HttpSession s = request.getSession();
    		s.setAttribute("currentuser", u);
    		response.sendRedirect("profile.jsp");
    	}
	}

}
