import java.util.ArrayList;

public class Customer {
	
	String name;
	int age;
	String number;
	int totalfee; // 손님이 산 전체금액
	ArrayList<Product> cproducts = new ArrayList<Product>(); // 손님이 산 물건 리스트
	
	Customer(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}	
		
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
 	
	void totalfee() {
		System.out.println(totalfee);
	}
	
}
