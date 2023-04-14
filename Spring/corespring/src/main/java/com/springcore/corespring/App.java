package com.springcore.corespring;

import org.springframework.context.*;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context =  new ClassPathXmlAppLicationContext("config.xml");
  }
}
