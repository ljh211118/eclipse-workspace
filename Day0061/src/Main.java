import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import com.lx.animal.BabyDog;
import com.lx.animal.Cat;
import com.lx.animal.Dog;
import com.lx.animal.Farm;
import com.lx.animal.IAnimal;

public class Main {

	public static void main(String[] args) {
		
		// 강아지와 고양이 만들어서 리스트에 넣기
		
		Farm farm1 = new Farm();
		
		Dog dog1 = new BabyDog();
		farm1.animals.add(dog1);
		
		Dog dog2 = new BabyDog();
		farm1.animals.add(dog2);
		
		Cat cat1 = new Cat() {
			public void walk(int speed) {
				System.out.println("고양이가 걸어갑니다.");
			}
		};
		// 틀이 미완성일 경우 상속을 해서 찍어내도 되고,
		// 미완성인 부분을 위처럼 작성해도 된다.(이를 추상클래스라고 한다.)
		farm1.animals.add(cat1);
		
		IAnimal animal1 = new IAnimal() {
			public void run() {
				System.out.println("동물이 뛰어갑니다.");
			}
			
			public void walk(int speed) {
				System.out.println("동물이 걸어갑니다.");
			}
		};
		farm1.animals.add(animal1);
		
		// 방법 1. 리스트 안에 들어있는 모든 아이템(원소, Element)을 꺼내와서 run 함수 실행하기
		// for문의 형태 : C-스타일
		for(int i = 0; i < farm1.animals.size(); i++) {
			IAnimal animal = farm1.animals.get(i);
			animal.run();
		}
		
		// 방법 2. 
		// for문의 형태 : 축약
		for(IAnimal animal : farm1.animals) {
			animal.run();
		}
		
		// 해시에 넣기
		HashMap<String, IAnimal> hash1 = new HashMap<String, IAnimal>();
		
		hash1.put("춘식", dog1);
		hash1.put("dog2", dog2);
		hash1.put("cat1", cat1);
		
		System.out.println("춘식이라는 이름으로 들어간 강아지 : " + hash1.get("춘식"));
		
		for(String key : hash1.keySet()) {
			System.out.println("키 : " + key + ", 값 : " + hash1.get(key));
		}
		
		// 날짜 확인하기(java util)
		Date date1 = new Date();
		System.out.println("지금 이 순간 : " + date1.getTime()); // 1970년을 기준으로 해서 시간을 체크한 거
		System.out.println("지금 이 순간 : " + date1);
		
		// 2024-07-08 14:49:32
		SimpleDateFormat format1 = new SimpleDateFormat("YYYY년 MM월 dd일 HH:mm:ss");
		String now = format1.format(date1);
		System.out.println("지금 이순간 : " + now);
		
		SimpleDateFormat format2 = new SimpleDateFormat("YYYY-MM-dd");
		String today = format2.format(date1);
		System.out.println("오늘 : " + today);
		
		// 2024-07-07 14:49:32
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date1);
		
		calendar.add(Calendar.DATE, -1);
		String yesterday = format2.format(calendar.getTime());
		System.out.println("어제 : " + yesterday);

	}

}
