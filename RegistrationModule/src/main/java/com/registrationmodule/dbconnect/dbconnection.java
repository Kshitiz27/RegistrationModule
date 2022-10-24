package com.registrationmodule.dbconnect;

	import java.sql.Connection;
	import java.sql.DriverManager;

	public class dbconnection {

		
		private static Connection con;
		public static Connection getconnection() {
			
			try {
				
				if(con==null) {
				
				//loading the driver...
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//creating the connection
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/regmod", "root", "cherry27");
				
				}
			
			} 
			
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			return con;
		}
	}



