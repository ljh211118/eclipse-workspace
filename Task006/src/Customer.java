import java.util.ArrayList;

public class Customer {
	
	String name; 
	int age;
	String number;
	
	ArrayList<Product> customerProducts = new ArrayList<Product>(); // 고객이 구매한 제품 목록
	
	int customerPrice = 0; // 고객이 지불한 총금액
	
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

}
