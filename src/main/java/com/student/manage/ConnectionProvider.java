package com.student.manage;

import java.sql.DriverManager;

import java.sql.Connection;

public class ConnectionProvider {
	static Connection con;
	//creating a method
	public static Connection createConnection() {
		
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// create the connection 
			String user="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/student_manage";
			con=DriverManager.getConnection(url,user,password);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return con;
	}

}
