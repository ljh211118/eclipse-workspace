
public class Cat extends Animal {
	
	static int countc = 0;
	
	Cat() {
		countc = countc + 1;
	}
	
	void Run() {
		System.out.println("야옹~" + name + "가 달립니다.");
	}
	
	void Stand() {
		System.out.println("야옹~" + name + "가 일어섭니다.");
	}
	
	void Sit() {
		System.out.println("야옹~" + "가 앉습니다.");
	}
}
