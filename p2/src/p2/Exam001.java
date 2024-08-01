package p2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam001 {

   public static void main(String[] args) {

      int Num = 78;
      int count = 0;
      ArrayList inputs = new ArrayList();

      Scanner scan = new Scanner(System.in);

      System.out.print("숫자를 입력해주세요 : ");
      int input = scan.nextInt();

      while (input < Num || input > Num) {
         
         count += 1;
         inputs.add(input);
         System.out.println("현재 도전횟수는 " + count + "번 입니다.");

         if (input > Num) {
            System.out.println("해당 숫자보다 위 입니다. 다시 입력해주세요");
            input = scan.nextInt();
         } else if (input < Num) {
            System.out.println("해당 숫자보다 아래 입니다. 다시 입력해주세요");
            input = scan.nextInt();
         } else if (input == Num) {
        	 System.out.println("해당 숫자보다 아래 입니다. 다시 입력해주세요");
         }
         
         break;
      }

   }

}
