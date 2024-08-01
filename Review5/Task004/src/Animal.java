
public class Animal {
	
	static int count = 0;
	
	Animal() {
		count++;
	}
	
	String name;
	int age;
	String number;
	
	void Run() {
		System.out.println("어흥~" + name + "가 달립니다.");
	}
	
	void Stand() {
		System.out.println("어흥~" + name + "가 일어섭니다.");
	}
	
	void Sit() {
		System.out.println("어흥~" + "가 앉습니다.");
	}
	
	
}
