
public class ExceptionTest {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			print(-5);
			System.out.println("after");
			System.out.println("after");
			System.out.println("after");
			System.out.println("after");
			System.out.println("after");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}

	private static void print(int count) throws Exception {
		if(count<0) throw new Exception("마이너스는 안되거든요!!!");
		System.out.println("after if");
		for(int i=0; i<count; i++) {
			System.out.println("Hello");
		}
		
	}
	
}