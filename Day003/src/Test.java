import com.lx.Fish;

public class Test {

	public static void main(String[] args) {
		
		// 붕어빵 만들기
		Fish fish1 = new Fish("붕어빵1");
		// fish1.name = "붕어빵1";
		fish1.setName("붕");
		fish1.swim();
		
		System.out.println("붕어빵1의 자식은 몇 마리일까요? : " + fish1.children.size());
		

	}


}
