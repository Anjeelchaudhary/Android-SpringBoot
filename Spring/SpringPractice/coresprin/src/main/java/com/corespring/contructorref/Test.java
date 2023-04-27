package com.corespring.contructorref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/corespring/contructorref/consConfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		
		Addition ad = (Addition) context.getBean("add");
		ad.sumAdds();
	}
}