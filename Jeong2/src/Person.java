
public class Person {
	
	String name, phone;
	int age;
	
	public Person(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	
	public void all() {
		System.out.println("[개인정보] 이름 : " + name + " / 나이 : " + age + " / 전화번호 : " + phone);
	}
	
	public void name() {
		System.out.println("이름 : " + name);
	}
	
	public void age() {
		System.out.println("나이 : " + age);
	}
	
	public void phone() {
		System.out.println("전화번호 : " + phone);
	}
}
