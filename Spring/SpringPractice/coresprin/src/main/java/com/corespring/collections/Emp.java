package com.corespring.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phones;
	private Set<String> addressess;
	private Map<String , String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddressess() {
		return addressess;
	}
	public void setAddressess(Set<String> addressess) {
		this.addressess = addressess;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<String> phones, Set<String> addressess, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addressess = addressess;
		this.courses = courses;
	} 
}