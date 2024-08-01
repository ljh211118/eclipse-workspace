
public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person(1, "일정현");
		Person person2 = new Person(2, "이정현");
		Person person3 = new Person(3, "삼정현");
		Person person4 = new Person(4, "사정현");
		Person person5 = new Person();
		
		person1.selfintroduce();
		person5.selfintroduce();
		System.out.println(Person.getPopulation());
	}

}

class Person {
	
	static int numberOfPersons = 0;
	
	int age;
	String name;
	
	Person() {
		numberOfPersons ++ ;
        this.age = 12;
        this.name = "Anonymous";
    }
	
	Person(int age, String name){
		numberOfPersons ++ ;
		this.age = age;
		this.name = name;
	}
	
	public static int getPopulation() {
		return Person.numberOfPersons;
	}
	
	public void selfintroduce() {
		System.out.println("내 이름은 " + name + "이며, 나이는 " + age + "살 입니다.");
	}
}
