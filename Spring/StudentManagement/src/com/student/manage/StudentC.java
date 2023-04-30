package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentC {
	public static boolean stuCreate(Student st) {
		boolean f = false;
		try {
			Connection con = Cprovider.create();
			String q = "insert into StudentManage(sId,sName,sMobileNo,sAddress) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(0,st.getStudnetId());
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2,st.getMobileNo());
			pstmt.setString(3,st.getAddress());
			
			pstmt.execute();
			f = true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}
}