package com.corespring.reffff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/corespring/reffff/conReff.xml");
		Aa tmp = (Aa) context.getBean("aRef");
		System.out.println(tmp.getX());
		Bb temp = (Bb) context.getBean("bRef");
		System.out.println(temp.getY());
	}

}
