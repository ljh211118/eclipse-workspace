
public class House {
	
	String name;
	
	Person person;
	
	Dog dog;
	
	House() {
		
	}
	
	House(String name) {
		this.name = name;
	}
	
	House(String name, Person person) {
		this.name = name;
		this.person = person;
	}
	
	House(String name, Person person, Dog dog) {
		this.name = name;
		this.person = person;
		this.dog = dog;
	}

}
