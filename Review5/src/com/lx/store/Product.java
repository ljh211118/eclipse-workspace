package com.lx.store;

public class Product {
	
	public String name;
	
	int price;
	
	// 팔린 전체 금액
	int total = 0;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	

}
