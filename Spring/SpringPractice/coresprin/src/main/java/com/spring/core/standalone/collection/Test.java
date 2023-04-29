package com.spring.core.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/standalone/collection/aloneconfig.xml");
		Person p1 =  (Person) context.getBean("persoo1");
		System.out.println(p1);
		System.out.println(p1.getFriendsName().getClass().getName());
	}
}
