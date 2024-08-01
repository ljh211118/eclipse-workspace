package com.lx.store;

import java.util.ArrayList;

public class Store {
	
	String name;
	
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	ArrayList<Product> products = new ArrayList<Product>();
	
	// 생성자 함수
	public Store(String name) {
		this.name = name;
	}

	
	// 고객이 물건 결제하기
	public void pay(Customer customer, Product product) {
	    // 고객이 산 물건을 고객에게 추가하기
		customer.items.add(product);
		// 고객이 산 총금액에 합산하기
		customer.total = customer.total + product.price;
		// 제품이 팔린 총금액에 합산하기
		product.total += product.price;
		
	}

}
