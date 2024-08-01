package mymy;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요!");
		ArrayList inputs = new ArrayList();
		
		int random = (int)(Math.random()*100);
		int input;
		int chance = 0;
		
		while(true) {
			
			input = scanner.nextInt(); 
			inputs.add(input);
			chance = chance + 1;
			System.out.printf("input=%d\n", input);
			
			if (input<0 || input>100) {
				System.out.println("0~100 사이의 숫자를 입력해주세요.");
			} else if(random == input) {
				System.out.println("답을 맞췄습니다 !");
				System.out.println(chance + "번만에 맞췄습니다.");
				System.out.println(inputs);
				break;
			} else if (input < random) {
				System.out.println("값이 더 큽니다.");
			} else if (input > random) {
				System.out.println("값이 더 작습니다.");
			} 
		
		}
		
	}

}
