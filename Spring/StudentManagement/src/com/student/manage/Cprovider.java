package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Cprovider {
	
	static Connection con;
	
	public static Connection create () {
		try {
			//loading drive
			Class.forName("com.mysql.jdbc.Driver");
			
			//creating connection
			String user = "anjeel";
			String password = "password";
			String url = "jdbc:mysql://localhost:3306/StudentManage"; //<-This is same for all 
			
			con = DriverManager.getConnection(url, user, password);  //builtedConnection
			 
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}