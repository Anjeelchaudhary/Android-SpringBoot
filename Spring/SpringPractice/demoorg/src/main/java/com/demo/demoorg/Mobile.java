package com.demo.demoorg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {

//		Ncell ncell = new Ncell();
//		ncell.calling();
//		ncell.data();
//		
//		Namastey namastey = new Namastey();
//		namastey.calling();
//		namastey.data();
//		
//		Sim sim = new Ncell();
//		sim.calling();
//		sim.data();
//		
//		Sim sim2 = new Namastey();
//		sim2.calling();
//		sim2.data();
		
		ApplicationContext context = ClassPathXmlApplicationContext("beans.xml");
	}
}
