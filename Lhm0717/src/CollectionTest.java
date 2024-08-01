import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
// 콜렉션 타입 : List, Set, Map
//List : 동적배열 => 크기를 변경가능, 인덱스로 참조함. 0번째, 1번째
	public static void main(String[] args) {
		
		int[] list = new int[5];
		List<Integer> list2 = new ArrayList();
		List list3 = new ArrayList();
		list3.add(44);
		list3.add("Hello");
		list3.add(new String());
		
		String str = (String) list3.get(1);
		
		list2.add(44);
		list2.get(0);
		int result = list2.get(0);
		
		System.out.println(list3.size());
		for(Object obj : list3) {
			System.out.println(obj);
		}
		for(int i = 0; i<list3.size(); i++) {
			Object obj = list3.get(i);
			System.out.println(obj);
		}
		
		list2.add("hello"); // Integer 타입만 넣을 수 있도록 한정시켰기 때문에
	}

}
