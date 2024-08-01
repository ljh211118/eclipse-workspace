
public class ExceptionTeest3 {

	public static void main(String[] args) {
		methodA();

	}
	private static void methodA() {
		try {
			methodB();
		} catch (RuntimeException e) {
		
		}
	}
	
	private static void methodB() throws RuntimeException {
		int random = (int) (Math.random()*10);
		if(random % 2 == 0) throw new RuntimeException();
	}

}
