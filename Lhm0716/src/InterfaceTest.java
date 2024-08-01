import java.util.List;

public class InterfaceTest {
	public static void main(String[] args) {
		MyInterface my = new MyInterface(); // 인터페이스이기 때문에 객체생성이 안됨
	}

}

interface MyInterface {
	void print();
	void write();
}	
	
class MyInterfaceImpl implements MyInterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	
}
