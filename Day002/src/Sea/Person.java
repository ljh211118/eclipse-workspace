package Sea;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void walk(int speed) {
		System.out.println(name +"이(가) " + speed + "km 속도로 걸어갑니다.");
	}
	
	public void hungry(String d) {
		System.out.println(name +"이(가) " + d + " 배고픕니다.");
	}

}