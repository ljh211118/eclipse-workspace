
public class Main {

	public static void main(String[] args) {
		
		Store store1 = new Store("안녕");
		
		Product water = new Product("물", 1000);
		Product rice = new Product("쌀", 20000);
		Product peach = new Product("복숭아", 15000);
		
		Customer j = new Customer("정현", 24, "010-9606-4111");
		Customer s = new Customer("정현", 24, "010-9606-4111");
		
		store1.setCustomers(j);
		
		store1.setProducts(water);
		store1.setProducts(rice);
		store1.setProducts(peach);
		
		store1.pay(j, water);
		store1.pay(j, rice);
		
		j.totalfee();
		
		water.totalfee();
		rice.totalfee();
		peach.totalfee();
		
		rice.countfee();
		peach.countfee(); // 전체 물건이 팔린 금액 그래서 아무 물건이나 와도 작동됨
		
		System.out.println();

	}

}
