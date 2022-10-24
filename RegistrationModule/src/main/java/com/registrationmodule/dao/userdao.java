package com.registrationmodule.dao;


import java.sql.*;


import com.registrationmodule.entity.student;

public class userdao {
	
	private Connection con;

	public userdao(Connection con) {
		this.con=con;
	}
	
	public boolean saveuser(student user) {
		
		boolean f= false;
		try {
			
			String query = "insert into student_users(fname, lname, mother_name, father_name, address, gender, state, city, dob, pincode, course, email_address, password) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = this.con.prepareStatement(query);
		
			pstmt.setString(1, user.getFname());
			pstmt.setString(2, user.getLname());
			pstmt.setString(3, user.getMother_name());
			pstmt.setString(4, user.getFather_name());
			pstmt.setString(5, user.getAddress());
			pstmt.setString(6, user.getGender());
			pstmt.setString(7, user.getState());
			pstmt.setString(8, user.getCity());
			pstmt.setString(9, user.getDob());
			pstmt.setString(10, user.getPincode());
			pstmt.setString(11, user.getCourse());
			pstmt.setString(12, user.getEmail_address());
			pstmt.setString(13, user.getPassword());
			
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		return f;
	}
	
	
	public student getuserbyemailandpassword(String email_address, String password) {
		
		student user = null;
		
		try {
			String query = "select * from student_users where email_address=? and password=?";
			PreparedStatement pstmt = this.con.prepareStatement(query);
			pstmt.setString(1, email_address);
			pstmt.setString(2, password);
			
			ResultSet set = pstmt.executeQuery();
			
			if(set.next()) {
				user= new student();
				user.setId(set.getInt("id"));
				String fname = set.getString("fname");
				user.setFname(fname);
				user.setLname(set.getString("lname"));
				user.setCourse(set.getString("course"));
				user.setPassword(set.getString("password"));
				
			}
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
		
	}
}

