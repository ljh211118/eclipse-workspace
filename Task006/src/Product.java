
public class Product {
	
	String name;
	int price;
	
	int eachPrice = 0; // 인스턴스 변수
	static int totalPrice = 0; // 클래스 변수
	
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
	
	public String toString() { 
		 return name + " " + price + "원";
	}

}
