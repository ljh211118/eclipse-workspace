
public class Task1 {
	
public static void main(String[] args) {
		
		String str1 = "iphone16:1900000:Apple";
		Product p1 = new Product(str1); // 생성해서는 안됨 메소드를 호출해서 메소드를 정의해야함
		p1.getProduct();
		
	}
}

class Product {
	
	String model;
	int price;
	String maker;

	Product(String str) {
		
		String[] parsingStr1 = str.split(":");
		// String[] parsingStr1 = [iphone16, 1900000, Apple]; 
		
		this.model = parsingStr1[0];
		this.price = Integer.parseInt(parsingStr1[1]);
		this.maker = parsingStr1[2];
		
	}
	
	public void getProduct() {
		
		System.out.println("Product model : " + model);
		System.out.println("Product price : " + price);
		System.out.println("Product maker : " + maker);
	}
}
