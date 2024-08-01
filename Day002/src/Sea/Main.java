package Sea;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Sea sea1 = new Sea();
		sea1.name = "태평양";
		
		
		// 붕어빵 틀에서 붕어빵 찍어내기 - 1. 첫번째 실행메소드에서 생성
		
		Fish fish1 = new Fish(); // 'new'를 통해 붕어빵 틀에서 붕어빵 찍어냄
		fish1.name = "슈크림붕어빵";
		fish1.min = 3;
		System.out.println("name : " + fish1.name + " / 태운 : " + fish1.min);
		fish1.burn();
		
		System.out.println("name : " + fish1.name);
		
		// 사람을 위한 붕어빵 틀에서 사람 찍어내기 - 1. 첫번째 실행메소드에서 생성
		
		//Person person1 = new Person();
		//person1.name = "이정현";
		//person1.age = 21;
		
		//person1.walk(4);
		
		// 사람을 위한 붕어빵 틀에서 사람 찍어내기 - 2. Person 클래스에서 생성
		Person person2 = new Person("이정현", 24);
		person2.walk(4);
		person2.hungry("무지막지");
		
		// 하나의 변수 상자 안에 여러개의 값을 넣어두기
		ArrayList<String> names = new ArrayList<String>();
		names.add("홍길동1");
		names.add("홍길동2");
		
		System.out.println("이름의 갯수 : " + names.size());
		System.out.println("첫번째 이름 : " + names.get(0));
	}

}
