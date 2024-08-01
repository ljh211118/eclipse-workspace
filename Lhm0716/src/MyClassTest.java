
public class MyClassTest {

	public static void main(String[] args) {
		
		Count count;
		count = new Count(); // 객체생성
		count.amount = 6000;
		System.out.println(count.amount);
		change(count); 
	}
}
class Count {
	int amount; // 1. class 카운트 안에 있는 변수
}
