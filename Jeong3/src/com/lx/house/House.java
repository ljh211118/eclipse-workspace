package com.lx.house;

import com.lx.animal.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class House {
    
    String name;
    ArrayList<Dog> dogsList = new ArrayList<Dog>(); // Houseㄱ Dog 클래스에서 dog 매개변수는 리스트로 받음
    
    /// 강아지 이름 입력 method
    public void setName(String name) {
        this.name = name;
    }
    
    /// 강아지 이름 출력 method
    public String getName() {
        return name;
    }
    
    /// 입력한 강아지를 리스트에 추가 method
    public void addDog(Dog dog) {
        dogsList.add(dog);
    }
    
    /// '입력한 강아지'를 모아놓은 리스트 method
    public ArrayList<Dog> addDogsList() {
        return dogsList;
    }
    
    /// 강아지 존재유무 / 마지막 강아지 출력 method
    public void lastDog() {
        
    	if ( ! dogsList.isEmpty()) {
    		for (int i = 0; i < dogsList.size(); i++) {
    			if(i == dogsList.size()-1) {
    				System.out.println("[마지막으로 입력한 강아지 정보]");
    				System.out.println("마지막으로 입력한 강아지의 이름 : " + dogsList.get(i).getName());
    				System.out.println("마지막으로 입력한 강아지의 나이 : " + dogsList.get(i).getAge());
    				System.out.println("마지막으로 입력한 강아지의 번호 : " + dogsList.get(i).getNumber());
    			}
    		}
    	} else {
            System.out.println("강아지가 없습니다.");
    	}
    }
    
    /// 강아지 이름 전체출력 method
    public void allDog() {
    	
    	System.out.println("[집안의 모든 강아지들]");
    	
    	for (int i = 0; i < dogsList.size(); i++) {
    			Dog dog = dogsList.get(i);
            System.out.println((i+1) + "번째 강아지 이름 :" + dog.getName());
        } 
    	
    }
    
    /// 강아지의 속성 입력 method
    public void addDogdetail() {
    	
        Scanner scanner = new Scanner(System.in);
        
        Dog dog = new Dog();
        
        System.out.println("강아지 이름을 입력하세요 (종료시 'exit' 입력): ");
        String dogName = scanner.nextLine();
        
        if (dogName.equalsIgnoreCase("exit")) { 
        	////// == 연산자를 사용하지 않는 이유
        	////// : 문자열의 실제 값이 아닌, 메모리 주소를 비교하는 것이기 때문
        	////// 즉, 문자열의 실제 값을 비교할 때에는 'equalsIgnoreCase()' 또는 'equals()'를 써야함
            return;
        }
        
        dog.setName(dogName);
        
        System.out.println("강아지 나이를 입력하세요: ");
        int dogAge =Integer.parseInt(scanner.nextLine()); 
        ////// 'nextInt()'는 enter(문자열)를 소비하지 않는다.
        ////// 그래서 다음을 실행하려고 enter를 치면 오류가 뜬다. 
        ////// 'nextLine()'은 문자열을 읽는 메소드이다.
        ////// 'nextLine()'을 통해 문자열로 나이를 받고,
        ////// 이를 'Integer.parseInt()'를 사용하여 문자열을 정수로 변환한다.
        dog.setAge(dogAge);
        
        System.out.println("강아지 번호를 입력하세요: ");
        String dogNumber = scanner.nextLine();
        dog.setNumber(dogNumber);
        
        addDog(dog);
    }
    
    // 2. 'House' 클래스에 'addHouse' 메소드를 추가하는 방식
    
    //////왜 static을 사용하는가?
 	////// 객체 생성 전에 호출 가능:
 	////// - static 메소드는 클래스 이름을 통해 직접 호출할 수 있음. 인스턴스 없이 가능.
 	////// - " 객체를 생성하기 전에 호출할 수 있음. "  이는 팩토리 메서드 패턴에서 자주 사용.
    ////// - 특정 객체 상태와 무관하게 동작하는 메소드에 적합.
    ////// - 클래스 메소드 (static이 있으면 class 메소드, 없으면 인스턴스 메소드)
 	
 	////// 인스턴스란 ?
 	////// : 그 설계도로부터 만들어진 실제 객체 ex) 속성값 house1, house2, house3 각각
 	////// - 인스턴스 상태에 의존한다 : 메소드가 속성값에 따라 다르게 동작
 	////// - 인스턴스 상태에 의존하지 않는다 : 메소드가 속성값과 무관하게 동작
    
    public static House addHouse() {
    	
    	Scanner scanner = new Scanner(System.in);
        
        House house = new House();
        
        System.out.println("집의 이름을 입력하세요: ");
        house.setName(scanner.nextLine());
        
        return house;
        
    }
}