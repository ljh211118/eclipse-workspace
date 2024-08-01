package myjdbc;

import java.util.List;
import java.util.Scanner;

public class JDBCMain2 {
	public static void main(String[] args) throws Exception {
//		Scanner scan = new Scanner(System.in);
//		System.out.print(" >> 직원명(입력안하면종료) : ");
//		String name = scan.nextLine();
//		while (!name.equals("")) {
//			List<Emp> list = EmpDAO.getEmpListByLastName(name);
//			for (Emp e : list) {
//				System.out.println(e);
//			}
//			System.out.print(" >> 직원명(입력안하면종료) : ");
//			name = scan.nextLine();
//		}
//
//		scan.close();
//		
		Scanner scan = new Scanner(System.in);
	    System.out.println("직원명(입력없으면 종료): ");
	    String name = scan.nextLine();
	    while(name!=null && name.length() !=0) {
	       List<Emp> list = EmpDAO.getEmpListByLastName(name);
	       for(Emp emp : list) {
	          System.out.println(emp);
	       }	// for
	       System.out.print("직원명(입력없으면 종료):");
	       name = scan.nextLine();
	    }	//while
	    
    
//	    Scanner scan = new Scanner(System.in);
//	      System.out.print("입사년도 : ");
//	      int hireYear = scan.nextInt();
//
//	      while (hireYear != 0) {
//	         List<Emp> list = EmpDAO.getEmpListByHireYear(hireYear);
//	         for (Emp e : list) {
//	            System.out.println(e);
//	         }
//	         System.out.print("입사년도(입력없으면 종료):");
//	         hireYear = scan.nextInt();
//	      }
//	}
	}
}
	
	

