import java.util.Hashtable;
import java.util.Properties;

public class Circle {
    public static void main(String[] args) {
        Shape shape = new Circle1(1, 1);
        
        /* 제네릭을 사용하여 타입을 명확히 지정
        Hashtable table = new Properties();
        */
        
        shape.print();
    }
}

abstract class Shape { // 추상 클래스
    int x, y;
    // declare, 메서드 선언 => 하위클래스에서 구현해라를 의미한다.
    // abstract void print();
    
    void print() {
    	System.out.println("Shape.print()");
    }
}

class Circle1 extends Shape {
    // 생성자
    Circle1(int x, int y) {
        this.x = x;
        this.y = y;
    }

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Circle1.print()");
	}
}