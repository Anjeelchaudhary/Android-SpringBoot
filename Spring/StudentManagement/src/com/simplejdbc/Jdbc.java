package com.simplejdbc;

import java.sql.*;


public class Jdbc {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/StudentManage";
		String name = "anjeel";
		String pass = "password";
		String query = "insert into student values(1,'Ragini','123456789','ktm')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,name,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String data = "";
		while(rs.next()) {
			data = rs.getInt(1)+" "+rs.getString(1);
			System.out.println(data);
		}
		st.close();
		con.close();
	}
}
