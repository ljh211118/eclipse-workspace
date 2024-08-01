
public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("안녕하세요.");
		
		// 변수상자 만들기
		
		String name;
		name = "안녕";
		
		int age;
		age = 21;
		
		System.out.println("이름 : " + name + "/나이 : " + age);
		
		// 변수상자 만들면서 초기화 하기
		
		String name2 = "이정현";
		int age2 = 24;
		
		System.out.println("이름 : " + name2 + "/나이 : " + age2);
		
		// 함수 실행
		
		print();
		
		walk(3);
		
		System.out.println(add(24, 27));
		
	}
	
	// 함수상자 만들기
		
	static void print() {
		
		System.out.println("print 함수 실행됨.");
		
	}
	
	static void walk(int speed) {
		
		System.out.println("사람이 " + speed + "km 속도로 걸어간다");
		
	}
	
	static int add(int a, int b) {
		
		return a+b;
	}

}
