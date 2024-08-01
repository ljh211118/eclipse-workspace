import java.util.ArrayList;
import java.util.HashMap;

public class Store {
	
	String name;
	ArrayList<Product> products = new ArrayList<Product>(); // 상점에서 판매하는 제품 목록
	
	Store() {
	}
	
	Store(String name) {
		this.name = name;
	}
	
	
	void setProducts(Product product) {
		this.products.add(product);
	}
	
	ArrayList<Product> getProducts() {
		return products;
	}
	
	void pay(Customer customer, Product product, String date, HashMap<String, ArrayList<Product>> dayToSoldProductList, HashMap<String, Integer> dayToTotal) {
		// 날짜별로 판매된 제품 목록과 매출액
        
		customer.customerProducts.add(product);
		
		product.eachPrice += product.price;
		customer.customerPrice += product.price;
		Product.totalPrice += product.price;
		
		/* // 날짜별로 판매된 상품 목록 업데이트
		// 1. "2024-07-08" 키가 존재하지 않으면 새 ArrayList<Product>를 추가
		dayToSoldProductList.putIfAbsent(date, new ArrayList<>());
		// 2. 키가 이미 존재하면 기존 값을 사용
		dayToSoldProductList.get(date).add(product);
        
        // 날짜별로 총 금액 업데이트
        dayToTotal.putIfAbsent(date, 0);
        dayToTotal.put(date, dayToTotal.get(date) + product.price);
        */
		

        // 날짜별로 판매된 상품 목록 업데이트
        ArrayList<Product> emptyProducts = dayToSoldProductList.get(date);
        //// 해시맵에 날짜별로 판매된 상품들을 저장하고, 날짜별로 새로운 판매가 발생할 때마다 해당 날짜의 리스트에 제품을 추가함
        //// 이 과정에서, 해당 날짜에 대한 키가 해시맵에 존재하지 않는 경우 새로운 리스트를 생성하여 해시맵에 추가함
        if (emptyProducts == null) { // 해당 Key로 등록된 값(날짜)이 없을 경우 null 값이 뜸(날짜 자체가 존재하지 않을 경우)
            emptyProducts = new ArrayList<Product>(); // 새로운 빈 리스트를 생성하고
            dayToSoldProductList.put(date, emptyProducts); // 새로운 빈 리스트를 date 키와 함께 해시맵에 추가함
        }
        emptyProducts.add(product);
        //// soldProducts 리스트에 현재 판매된 product를 추가함
        //// 이 리스트는 dayToSoldProductList.get(date)를 통해 가져온 리스트
        //// 이미 해시맵에 존재하는 리스트이거나 새로 생성하여 해시맵에 추가한 리스트
        //// 이로써 해당 날짜의 상품 목록에 새로운 상품이 추가됨
        
        Integer total = dayToTotal.get(date);
        if(total == null) {
        	total = 0;
        }
        dayToTotal.put(date, total + product.price);
        
	}
}
