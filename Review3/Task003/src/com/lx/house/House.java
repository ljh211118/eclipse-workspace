package com.lx.house;

import com.lx.animal.Dog;

import java.util.ArrayList;

public class House {

	
	String name;
	ArrayList<Dog> dogs = new ArrayList<Dog>();

	
	// #1. 생성자에서 초기화
	// 생성자는 House 객체가 생성될 때 dogs 리스트를 초기화
	// House 객체가 생성될 때 dogs 리스트를 빈 리스트로 초기화하여, 이후에 Dog 객체를 추가할 준비를 함
	// 그러나 이 방법만으로는 Dog 객체를 dogs 리스트에 추가하는 기능을 제공하지 않음
	public House() {
		this.dogs = new ArrayList<Dog>();
    } 
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Dog> getDog() {
	    return dogs;
	}
	
	// #2. House 객체 내부의 dogs 리스트를 외부에서 전달된 새로운 ArrayList<Dog>로 교체
	public void setDog(ArrayList<Dog> dogs) {
	    this.dogs = dogs;
	}
	// : 새로운 리스트를 설정하여, 기존 리스트의 모든 요소를 대체함
	
	public void addDogs(Dog dog) {
	    this.dogs.add(dog);
	}
	
	public void run() {
		if(dogs.size() < 1) {
			System.out.println("강아지가 없습니다.");
		} else {
			System.out.println("안녕하세요. 첫번째 강아지의 이름은 " + dogs.get(0).getName() + "입니다.");
		}
	}
	
	public void allDog() {
		if(dogs.size() == 0) {
			System.out.println("강아지가 없습니다.");
		} else {
			System.out.println("강아지는 총 " + dogs.size() + "마리 있습니다.");
			for(int i = 0; i < dogs.size(); i++) {
				System.out.println( (i + 1) +"번째 강아지의 이름은 " + dogs.get(i).getName() + "입니다.");
			}
		}
	}
}
