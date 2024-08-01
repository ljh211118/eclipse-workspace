package extend;

public class Main {

	public static void main(String[] args) {
		
		Fish fish1 = new Fish();
		fish1.name = "붕어빵1";
		
		Shark shark1 = new Shark();
		shark1.name = "상어빵1";
		
		System.out.println("상어빵의 이름 : " + shark1.name);
		System.out.println("물고기 몇 마리? : " + Fish.count);
		System.out.println("상어 몇 마리? : " + Shark.count1);
		
		fish1.swim();
		shark1.swim();
		shark1.run();
		
		
		//////
		
		
		Fish shark2 = new Shark();
		shark2.name = "상어빵2";
		
		System.out.println("물고기 몇 마리? : " + Fish.count);
		System.out.println("상어 몇 마리? : " + Shark.count1);
	
		//shark2.run(); = 오버라이드 안돼서 안돌어감
		
		Shark shark3 = (Shark)shark2;
		
		System.out.println("물고기 몇 마리? : " + Fish.count);
		System.out.println("상어 몇 마리? : " + Shark.count1);
		
		shark3.run();
		
		System.out.println("몇 마리? : " + Fish.count);
		
		
		//////
		
		
		double temp = 36.5;
		double temp2 = Math.floor(temp); //Math.round()
		System.out.println("원래 값 : " + temp + " / 바뀐값 : " + temp2);
	}

}
