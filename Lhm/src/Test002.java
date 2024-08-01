import java.util.Calendar;

public class Test002 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // cal은 변수, 32비트, 64비트, 4바이트 메모리 공간 할당받아 이름붙인 변수
		System.out.println(cal.get(5));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(Calendar.DAY_OF_MONTH);

	}

}
