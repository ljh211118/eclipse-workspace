package com.lx.store;

import java.util.ArrayList;

public class Customer {
	
	String name;
	
	int age;
	
	String mobile;
	
	public ArrayList<Product> items = new ArrayList<Product>();
	
	// 내가 산 총 금액
	public int total = 0;
	
	public Customer(String name, int age, String mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	
	public String getName() {
		return this.name;
	}

}
