
public class Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name = "멍멍이";
		
		Animal alldog1 = new Dog();
		dog1.name = "올멍멍이";
		
		Animal allcat1 = new Cat();
		dog1.name = "올냥냥이";
		
		System.out.println(Animal.count);
		System.out.println(Cat.countc);
		System.out.println(Dog.countd);
		
		alldog1.Run();
		alldog1.Stand();
		alldog1.Sit();
		
	}

}
