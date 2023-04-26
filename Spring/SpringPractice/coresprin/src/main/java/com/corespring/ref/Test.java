package com.corespring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("1");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/corespring/ref/refconfig.xml");
		System.out.println("2");
		A temp = (A) context.getBean("a");
		System.out.println(temp.getX());
	}
}