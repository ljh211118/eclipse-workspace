import com.lx.house.House;
import com.lx.animal.Dog;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		House house1 = new House();
		
		house1.setName("일층집");
		
		Dog dog1 = new Dog();
		dog1.setName("일멍이");		
		
		Dog dog2 = new Dog();
		dog2.setName("이멍이");
		
		Dog dog3 = new Dog();
		dog3.setName("삼멍이");	
		
		house1.addDogs(dog1);
		house1.addDogs(dog2);
		house1.addDogs(dog3);
		
		house1.run();
		house1.allDog();
		
		ArrayList<Dog> newDogs = new ArrayList<Dog>();
	    Dog dog4 = new Dog();
	    dog4.setName("사멍이");
	    newDogs.add(dog4);
	    
	    house1.setDog(newDogs);

	    house1.run();
		house1.allDog();
		
	}

}
