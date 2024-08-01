import java.util.ArrayList;

public class Product {
	
	String name;
	int price;
	
	int totalfee = 0; // 물건이 팔린 전체금액
	
	static int totalsell = 0;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
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
	
	void countfee() {
		System.out.println(totalsell);
	}

}
