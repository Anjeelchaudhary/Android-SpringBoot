package com.corespring.contructorref;

import java.util.List;

public class Person {
	private String personName;
	private int personId;
	private Certificate certify;
	private List<String> list;
	
	Person(String personName,int personId,Certificate certify,List<String> list) {
		this.personName = personName;
		this.personId = personId;
		this.certify = certify;
		this.list = list;
	}

	@Override
	public String toString() {
		return this.personName + " : "+this.personId+"{" + this.certify+"}"+this.list;
	}
	
	
	
	
}
