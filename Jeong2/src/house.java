
public class house {
	
    String name;
    Cat cat;
    Dog dog;
    Person person;
  
    public house(String name, Cat cat, Dog dog, Person person) {
        this.name = name;
        this.cat = cat;
        this.dog = dog;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public Person getPerson() {
        return person;
    }
}