package com.corespring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/corespring/collection/collectionconfig.xml");
		Emp emp1 = (Emp) context.getBean("employee1");
		System.out.print(emp1.getName());
	}

}
