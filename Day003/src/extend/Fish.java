package extend;

public class Fish {
	
	String name;
	int age;
	
	static int count = 0;
	
	Fish() {
		count = count + 1;
	}

	void swim() {
		System.out.println("붕어빵이 헤엄칩니다.");
	}
	
}
