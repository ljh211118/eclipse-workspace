package p2;

public class Exam77 {
	public static void main(String[] args) {
		// int count;  // 4번 공간이 실행되면 메모리공간에 4bit를 할당받아서 count라는 이름을 붙여줌.
		// count = 500; 
		
		/*
		 * 1부터 얼마까지 누적해야 10000을 초과할까?
		 * 
		 */ 
		
		int sum = 0;
		int count = 0;
		
		/*
		 * if - 참 거짓에 따라 분기
		 * for - 정해진 횟수만큼 반복
		 * while - 횟수는 모르지만 반복
		 * switch - 여러 경우에 따라 분기
		 */
		
		while(sum<=1000000) {
			count = count + 1;
			sum = sum + count;
			//System.out.printf("count=%d, sum=%d\n", count, sum);
		}
		System.out.printf("count=%d, sum=%d\n", count, sum);
	}
}
