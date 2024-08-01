
public class Test1 {

	public static void main(String[] args) {
		
		// print1 함수상자 실행
		print1();
		
		// walk 함수상자 실행
		walk(8);
		
		// add1 함수상자 실행
		int add1 = add1(10, 10);
		System.out.println("더하기1 결과 : " + add1);
		
		// add2 함수상자 실행
		add2(15, 15);
		
	}
	
	static void print1() {
		System.out.println("print1 함수가 실행되었어요.");
	}
	
	static void walk(int speed) {
		System.out.println("사람이" + speed + "km 속도로 걸어갑니다.");
		
	}
	
	// 1. 반환타입이 있는 메소드
	// : 두 개의 int 인자를 더한 결과를 반환
	//   호출한 쪽에서 이 결과를 사용할 수 있음
	static int add1(int a, int b) {
		return a + b;
	}
	
	
	
	// 2. 반환타입이 없는 메소드
	// : 두 개의 int 인자를 더한 결과를 콘솔에 출력
	//   반환 값이 없으며, 메소드를 호출한 쪽에서는 결과를 받을 수 없음
	static void add2(int a, int b) {
		int add2 = a + b;
		System.out.println("더하기2 결과 : " + add2);
	}

}
