package com.lx;

import java.util.ArrayList;

public class Fish {
	
	String name;
	public ArrayList children = new ArrayList();
	
	public Fish() {
		
	}
	
	public Fish(String name) {
		this.name = name;
		
		children.add("붕어빵1");
	}
	
	public void setName(String name) {
		if (name.length() < 2) {
			System.out.println("붕어빵의 이름은 2글자 이상이어야 합니다.");
			return;
		}
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public void swim() {
		System.out.println("물고기가 헤엄칩니다.");
	}

}
