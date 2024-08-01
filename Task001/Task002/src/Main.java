
public class Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("일멍이");
		Person person1 = new Person("정현1", 1, "112");
		Cat cat1 = new Cat("일냥이");
		
		House house1 = new House("일층집", person1, cat1, dog1);
		
		house1.getDog().name();

	}

}
