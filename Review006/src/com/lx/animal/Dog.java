package com.lx.animal;

public class Dog extends Animal {
	
	public static int count = 0;
	
	String name;
	int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		
		Dog.count = Dog.count + 1;
	}

}
