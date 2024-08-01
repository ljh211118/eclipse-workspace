
public class Dog extends Animal {
	
	static int countd = 0;
	
	Dog() {
		countd = countd + 1;
	}
	
	void Run() {
		System.out.println("멍멍~ 달립니다.");
	}
	
	void Stand() {
		System.out.println("멍멍~ 일어섭니다.");
	}
	
	void Sit() {
		System.out.println("멍멍~ 앉습니다.");
	}

}
