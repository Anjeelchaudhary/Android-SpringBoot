package com.corespring.contructorref;

public class Person {
	private String personName;
	private int personId;
	
	Person(String personName,int personId) {
		this.personName = personName;
		this.personId = personId;
	}

	@Override
	public String toString() {
		return this.personName + " : "+this.personId;
	}
	
	
}
