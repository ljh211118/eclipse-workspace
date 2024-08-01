import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Home arr[] = new Home[n]; 
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("새로운 입력입니다.");
			
			System.out.println("이름을 입력하세요 : ");
	        String name = sc.nextLine();
	        System.out.println("나이를 입력하세요 : ");
	        int age = sc.nextInt();
	        sc.nextLine();
	        System.out.println("전화번호를 입력하세요 : ");
	        String phone = sc.nextLine();
	        Person person1 = new Person(name, age, phone);
			
			System.out.println("반려묘 이름을 입력하세요 : ");
			Cat cat1 = new Cat(sc.nextLine());
			
			System.out.println("반려견 이름을 입력하세요 : ");
	        Dog dog1 = new Dog(sc.nextLine());
	        
	        System.out.println("집주소를 입력하세요 : ");
	        arr[i] = new Home(sc.nextLine(), cat1, dog1, person1);
	       
		}
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i].getPerson().all();
			System.out.println("[자택정보] 주소 : " + arr[i].getName());
	        arr[i].getCat().name();
	        arr[i].getDog().name();
	      
		}
        
	}

}