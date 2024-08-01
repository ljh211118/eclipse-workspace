import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		
		Car hudson = new Car();
		hudson.setName("Hudson");
		hudson.setSpeed(1);
		
		Car master = new Car();
		master.setName("Master");
		master.setSpeed(2);
		
		Car carrera = new Car();
		carrera.setName("Carrera");
		carrera.setSpeed(3);
		
		System.out.println(carrera.getName());
		System.out.println(carrera.getSpeed());
	}

}

class Car {
	String name;
	int speed;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
}