package com.registrationmodule.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.registrationmodule.dao.userdao;
import com.registrationmodule.dbconnect.dbconnection;
import com.registrationmodule.entity.student;

/**
 * Servlet implementation class registerserv
 */
public class registerserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public registerserv() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname = request.getParameter("fname");
		
		String l_name = request.getParameter("l_name");
		String mother_name = request.getParameter("mother_name");
		String father_name = request.getParameter("father_name");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		String dob = request.getParameter("dob");
		String pincode = request.getParameter("pincode");
		String course = request.getParameter("course");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		student user = new student(fname, l_name, mother_name, father_name, address, gender, state, city, dob, pincode, course, email, password);
		
		userdao dao = new userdao(dbconnection.getconnection());
		
		PrintWriter out = response.getWriter();
		
		if(dao.saveuser(user)) {
			out.println("STUDENT REGISTERED TO THE DATABASE");
		}
		
		else {
			out.println("ERROR IN SAVING CONNECTION....try with different email");
			
		}
	}

}
