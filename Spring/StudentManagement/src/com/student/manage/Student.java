package com.student.manage;

public class Student {
	private String studnetId;
	private String studentName;
	private String mobileNo;
	private String address;
	public Student(String studnetId, String studentName, String mobileNo, String address) {
		super();
		this.studnetId = studnetId;
		this.studentName = studentName;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	public Student(String address) {
		super();
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStudnetId() {
		return studnetId;
	}
	public void setStudnetId(String studnetId) {
		this.studnetId = studnetId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studnetId=" + studnetId + ", studentName=" + studentName + ", mobileNo=" + mobileNo
				+ ", address=" + address + "]";
	}
}