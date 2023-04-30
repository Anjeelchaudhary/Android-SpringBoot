package com.student.manage;

public class Student {
	private int studnetId;
	private String studentName;
	private int mobileNo;
	private String studentAddress;
	@Override
	public String toString() {
		return "Student [studnetId=" + studnetId + ", studentName=" + studentName + ", mobileNo=" + mobileNo
				+ ", studentAddress=" + studentAddress + "]";
	}
	public int getStudnetId() {
		return studnetId;
	}
	public void setStudnetId(int studnetId) {
		this.studnetId = studnetId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studnetId, String studentName, int mobileNo, String studentAddress) {
		super();
		this.studnetId = studnetId;
		this.studentName = studentName;
		this.mobileNo = mobileNo;
		this.studentAddress = studentAddress;
	}
}
