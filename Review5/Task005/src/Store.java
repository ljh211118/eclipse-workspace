import java.util.ArrayList;

public class Store {
	
	String name;
	ArrayList<Customer> customers = new ArrayList<Customer>();
	ArrayList<Product> products = new ArrayList<Product>();
	
	Store() {
		
	}
	
	Store(String name){
		this.name = name;
	}
	
	void setCustomers(Customer customer) {
		this.customers.add(customer);
	}
	
	ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	void setProducts(Product product) {
		this.products.add(product);
	}
	
	ArrayList<Product> getProducts() {
		return products;
	}
	
	void pay(Customer customer, Product product) {
		
		customer.cproducts.add(product); // 전체 상품 목록 출력하기 위해서 있는거임 계산할 때 관여하는 코드는 아님
		
		customer.totalfee += product.price;
		
		product.totalfee += product.price;
		
		Product.totalsell += product.price;
	}
	
	
}
