package com.corespring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/corespring/lifecycle/configFilelifecycle.xml");
			Human humn = (Human) context.getBean("h1");
			System.out.println(humn);
	}
}
