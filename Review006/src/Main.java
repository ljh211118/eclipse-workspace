import com.lx.animal.Dog;
import com.lx.animal.Animal;
import com.lx.animal.Cat;
import com.lx.animal.Farm;

public class Main {
	
	public static void main(String[] args) {
		
		Farm farm1 = new Farm();
		
		Dog dog1 = new Dog("강아지1", 1);
		Dog dog2 = new Dog("강아지2", 2);
		
		farm1.animals.add(dog1);
		
		System.out.println("찍어낸 강아지 수 : " + Dog.count);
		
		Cat cat1 = new Cat("고양이1", 1);
		farm1.animals.add(cat1);
		
		System.out.println("찍어낸 동물 수 : " + farm1.animals.size());
		
		int dogCount = 0;
		int catCount = 0;
		
		for(int i = 0; i<farm1.animals.size(); i++) {
			Animal animal = farm1.animals.get(i);
			if(animal instanceof Dog) {
				System.out.println("인덱스 " + i + " : " + "강아지");
				dogCount = dogCount + 1;
			} else if(animal instanceof Cat) {
				System.out.println("인덱스 " + i + " : " + "고양이");
			}
		}
		
		System.out.println("농장 안에 있는 강아지 마리 수 : " + dogCount);
		System.out.println("농장 안에 있는 고양이 마리 수 : " + catCount);
	
	}

}
