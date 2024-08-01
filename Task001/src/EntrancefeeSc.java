
public class EntrancefeeSc {

	public static void main(String[] args) {
		
		calculate(4, 2, 20000, 9900);
		salefee(4, 2, 20000, 9900);
			
	}

	
	static void calculate(int adultcount, int childcount, int adultfee, int childfee) {
		
		int totalcount = adultcount + childcount;
		int fee = (adultcount * adultfee) + (childcount * childfee);
		double discount = 0.2;
		
		if (totalcount >= 5) { 
			System.out.println("지불금액 : " + (int) (fee - (fee * discount)));
		} else {
			System.out.println("지불금액 : " + (int)fee);
		}
	}
	
	static void salefee(int adultcount, int childcount, int adultfee, int childfee) {
		
		int totalcount = adultcount + childcount;
		int fee = (adultcount * adultfee) + (childcount * childfee);
		double discount = 0.2;
		
		if (totalcount >= 5) { 
			System.out.println("할인금액 : " + (int) (fee * discount));
		} else {
			System.out.println("할인금액이 없습니다.");
		}
	}
}