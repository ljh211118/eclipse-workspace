import com.lx.animal.Cat;
import com.lx.animal.Dog;
import com.lx.animal.Farm;
import com.lx.animal.IAnimal;

public class Main {

	public static void main(String[] args) {
		
		// 강아지와 고양이 만들어서 리스트에 넣기
		
		Farm farm1 = new Farm();
		
		Dog dog1 = new Dog();
		farm1.animals.add(dog1);
		
		Dog dog2 = new Dog();
		farm1.animals.add(dog2);
		
		Cat cat1 = new Cat();
		farm1.animals.add(cat1);
		
		for(int i = 0; i < farm1.animals.size(); i++) {
			IAnimal animal = farm1.animals.get(i);
			animal.run();
		}
		
	}

}
