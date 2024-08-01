package Sea;

public class Fish {
	
	String name;
	int min;
	
	// 기본 생성자
	Fish() {
	}
	
	// 매개변수 생성자
	Fish(String name, int min){
		this.name = name;
		this.min = min;
	}
	
	public void burn() {
		System.out.println("경고!! " + name + "을 " + min + "분이나 태웠습니다.");
		
	}
	
}