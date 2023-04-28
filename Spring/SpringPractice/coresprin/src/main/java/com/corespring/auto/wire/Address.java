package com.corespring.auto.wire;

public class Address {
	private String city;
	private String wadaNo;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWadaNo() {
		return wadaNo;
	}
	public void setWadaNo(String wadaNo) {
		this.wadaNo = wadaNo;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", wadaNo=" + wadaNo + "]";
	}
	
}
