
public class House {
	
	String name;
	Person person;
	Cat cat;
	Dog dog;
	
	House() {
		
	}
	
	House(String name, Person person, Cat cat, Dog dog) {
		this.name = name;
		this.person = person;
		this.cat = cat;
		this.dog = dog;
	}

	Dog getDog() {
		return dog;
	}
	
	Cat getCat(Cat cat) {
		return cat;
	}
	
}
