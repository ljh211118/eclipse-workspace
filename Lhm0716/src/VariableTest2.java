
public class VariableTest2 {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		dog1.age = 5;
		Dog.name = "Puppy";
		dog2.age = 10;
		System.out.println(Dog.name);
		System.out.println(dog2.age);

	}

}

class Dog {
	int age;
	static String name;
}
