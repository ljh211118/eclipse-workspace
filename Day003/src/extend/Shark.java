package extend;

public class Shark extends Fish{
	
	static int count1 = 0;
	
	Shark() {
		count1 = count1 + 1;
	}
	
	void swim() {
		System.out.println("상어빵이 헤엄칩니다.");
	}
	
	void run() {
		System.out.println("상어빵이 달려갑니다.");
	}

}
