package com.corespring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/corespring/ref/refconfig.xml");
		A temp = (A) context.getBean("aref");
		System.out.println(temp.getX());
		
	}

}
