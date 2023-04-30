package com.student.manage;

public class Cprovider {
	
	public void create () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
