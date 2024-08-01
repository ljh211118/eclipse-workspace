import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		House house1 = new House("우리집1");
		House house2 = new House("우리집2");
		
		Person person1 = new Person("홍길동1");
		Dog dog1 = new Dog("멍멍이1");
		House house3 = new House("우리집3", person1, dog1);
		
		System.out.println("집 : " + house3.name + ", 집 안의 사람 : " + house3.person.name + ", 집 안의 강아지 : " + house3.dog.name);
		
		// 여러 글자를 넣어두기
		
		ArrayList<String> names = new ArrayList();
		names.add("홍길동1");
		names.add("홍길동2");
		names.add("홍길동3");
		
		System.out.println("두번째 칸에 들어있는 이름 : " + names.get(1));
		
		
		

	}

}
