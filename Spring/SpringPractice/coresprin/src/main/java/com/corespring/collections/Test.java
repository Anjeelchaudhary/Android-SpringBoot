package com.corespring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/corespring/collections/collectionconfig.xml");
		Emp emp1 = (Emp) context.getBean("employee1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddressess());
		System.out.println(emp1.getCourses());
	}

}
