import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("입력해주세요.");
			String i = sc.nextLine();
			int result = convert(i);
			System.out.println("변환된 숫자는 " + result + " 입니다.");
		
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
		
	}
	
	private static int convert(String i) throws Exception {
		
		if(i.length() == 0) throw new Exception("예외가 발생되었습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다.");
		
		// length는 개행을 읽지 않아서 사용
		
		if(i.equals("ㅅㅂ")) throw new Exception("욕설과 비방은 입력이 안됩니다.");
		
		int k = Integer.parseInt(i);
		
		return k;
	}

}