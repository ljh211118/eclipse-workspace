package com.lx.animal;

//붕어빵 틀
public class Dog extends animal {
	
	//클래스 변수 -붕어빵 틀에 붙어있는 진짜 변수
	//클래스 이름.변수상자 이름 => ex) Dog.count는 어디서든 사용할 수 o
	public static int count=0;
	String name; //변수상자(=속성)
	int age;
	
	//생성자 함수(메서드,method) - 붕어빵 틀에서 붕어빵을 찍어낼 때 자동으로 실행되는 함수
	public Dog(String name, int age) {
		this.name=name;
		this.age=age;
		
		Dog.count=Dog.count+1;
	}
	
}
