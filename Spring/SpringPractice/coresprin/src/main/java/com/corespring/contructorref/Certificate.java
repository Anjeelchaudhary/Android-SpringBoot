package com.corespring.contructorref;

public class Certificate {
	public String work;
	
	Certificate(String work) {
		super();
		this.work = work;
	}

	@Override
	public String toString() {
		return this.work;
	}
	
	
}
