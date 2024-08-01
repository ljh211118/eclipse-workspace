package com.lx.review;

import com.lx.animal.Cat;
import com.lx.animal.Dog;
import com.lx.animal.Farm;
import com.lx.animal.animal;

public class Test {
	//여기서 Static은 붕어빵 틀
	public static void main(String[] args) {


		//변수 상자 만들기
		String name;
		int age;
		
		name= "홍길동1";
		age=21;
		
		String name2 ="홍길동2";
		
		//함수상자 만들기
		int result=Test.add(10,10);
		System.out.println("더하기 결과 :" +result);
		
		//붕어빵 틀에서 붕어빵 찍어내기
		Farm farm1 = new Farm();
		
		Dog dog1=new Dog("강아지1",1);
		farm1.animals.add(dog1);
		
		Dog dog2=new Dog("강아지2" , 2);
		farm1.animals.add(dog2);
		
		System.out.println("찍어낸 강아지 마리수 : " + Dog.count);

		Cat cat1= new Cat("고양이1",1);
		farm1.animals.add(cat1);
		
		System.out.println("찍어낸 동물 수 : " + farm1.animals.size());

		int dogCount = 0;
		int catCount = 0;
		for(int i=0;i<farm1.animals.size();i++) {
			animal animal = farm1.animals.get(i); //어려움
			if (animal instanceof Dog) {
				//instanceof = 객체
				System.out.println("인덱스: "+i + " : "+"강아지");
				dogCount = dogCount+1;
				
			}else if (animal instanceof Cat) {
				System.out.println("인덱스: "+i + " : "+"고양이");
				catCount = catCount+1;
			}
			
			
		}
		System.out.println("농장 안에 있는 강아지 마리수  " + dogCount + " ,고양이 마리수 "+catCount);
	}

	//함수상자 정의
	static int add(int a, int b) {
		int result=  a+b;
		return result;
	}
}
