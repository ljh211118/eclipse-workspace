
public class APITest {

	public static void main(String[] args) {
		
		int count = Integer.MAX_VALUE; // 2^31 -1 => 2147483647
		System.out.println(count);
		System.out.println(Integer.toBinaryString(count));
		count = count + 1; // -2147483647 => -2^31
		System.out.println(count);
		System.out.println(Integer.toBinaryString(count));

	}
	
}