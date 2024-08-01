import com.lx.store.Customer;
import com.lx.store.Product;
import com.lx.store.Store;

public class Main {

	public static void main(String[] args) {
		
		Store store1 = new Store("강남역 매장");
		Store store2 = new Store("서울역 매장");
		
		Customer customer1 = new Customer("일일이", 21, "010-1111-1111");
		Customer customer2 = new Customer("이이이", 22, "010-2222-2222");
		
		Product product1 = new Product("Benz", 10000);
		Product product2 = new Product("BMW", 25000);
		
		// 고객이 제품 결제합니다
		store1.pay(customer1, product2);
		store1.pay(customer1, product2);
		
		store2.pay(customer2, product2);
		
		System.out.println("고객 " + customer1.getName() + " : " + customer1.total);
		
		// 첫번째 고객이 산 물건들은 어떤 것들일까요 ?
		System.out.println("제품들 개수 : " + customer1.items.size());
		for(int i = 0; i < customer1.items.size(); i++) {
			System.out.println("     제품" + i + " : " + customer1.items.get(i).name);
		}
	}

}
