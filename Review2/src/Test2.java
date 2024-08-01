
public class Test2 {

	public static void main(String[] args) {
		
		// 함수 상자 실행하기
		int a = add(10, 10);
		System.out.println(a);

	}
	
	// 함수 상자 만들기
	
	static int add(int a, int b) {
		System.out.print("add 함수 실행함 : ");
		int result = a+b;
		return result;
	}

}
