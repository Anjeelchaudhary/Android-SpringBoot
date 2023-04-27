package com.corespring.contructorref;

public class Person {
	private String personName;
	private int personId;
	private Certificate certify;
	
	Person(String personName,int personId,Certificate certify) {
		this.personName = personName;
		this.personId = personId;
		this.certify = certify;
	}

	@Override
	public String toString() {
		return this.personName + " : "+this.personId+"{" + this.certify+"}";
	}
	
	
	
	
}
