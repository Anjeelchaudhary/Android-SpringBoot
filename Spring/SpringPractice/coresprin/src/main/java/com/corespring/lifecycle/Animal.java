package com.corespring.lifecycle;

import org.springframework.beans.factory.InitializingBean;

public class Animal implements InitializingBean{
	private int price ;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Animal [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
