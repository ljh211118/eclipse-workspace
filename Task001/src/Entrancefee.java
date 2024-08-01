
public class Entrancefee {

	public static void main(String[] args) {
		
		int adultcount = 4;
		int childcount = 2;
		int adultfee = 20000;
		int childfee = 9900;
		
		double totalfee = calculate(adultcount, childcount, adultfee, childfee);
		
		int totalfeeint = (int) totalfee;
		// 형 변환 이유
		// : totalfee는 double 타입의 값
		//   이 값을 int 타입으로 변환하여 소수점 이하를 버리고 정수 값을 얻음. 
		
		System.out.println("성인 수 : " + adultcount);
		System.out.println("어린이 수 : " + childcount);
		System.out.println("입장료 : " + totalfeeint);
		
		double calculate = calculate(adultcount, childcount, adultfee, childfee);
		System.out.println("지불금액 : " + calculate);
		
		double salefee = salefee(adultcount, childcount, adultfee, childfee);
		System.out.println("할인율 : " + salefee);
		
	}
	
	static double calculate(int adultcount, int childcount, int adultfee, int childfee) {
		
		int totalcount = adultcount + childcount;
		int fee = (adultcount * adultfee) + (childcount * childfee);
		double totalfee = fee;
		double discount = 0.2;
		
		if (totalcount >= 5) { 
			totalfee = fee - (fee * discount);
		} return totalfee;
	}
	
	static double salefee(int adultcount, int childcount, int adultfee, int childfee) {
	
		int totalcount = adultcount + childcount;
		int fee = (adultcount * adultfee) + (childcount * childfee);
		double discount = 0.2;
				
		// 전체 사람 수 계산하기
	
		if (totalcount >= 5) { 
			return fee * discount;
		} else {
			return 0;
		}
	
	}
}