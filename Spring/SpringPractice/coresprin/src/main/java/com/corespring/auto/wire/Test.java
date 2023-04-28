package com.corespring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/corespring/auto/wire/configFileauto.xml");
		Emp em = context.getBean(Emp.class);
		System.out.println(em);
	}

}
