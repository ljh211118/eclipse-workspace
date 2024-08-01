import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// List, Set, Map
// List : 동적배열, 인덱스로 참조
// Map : 이름을 붙여서 넣어둠
// Set : 중복불가한 수학의 Set

public class CollectionTest2 {
	public static void main(String[] args) {
		Map map = new HashMap(); // Map인터페이스의 하위클래스 중 하나를 생성한다.
		map.put("age", 22);
		map.put("emp", "1111:Lee:2022-02-02");
		map.put("greet", "Hello");
		int age = (int) map.get("age");
		Object obj = map.get("emp");
		String empInfp = (String) obj;
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("id", 11111);
		map2.put("price", 2000000);
		int id = map2.get("id");
		
		Set<String> setList = new HashSet<String>();
		
		Set KeyList = map.keySet();
		Iterator<String> it = KeyList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
