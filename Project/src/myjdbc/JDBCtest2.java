package myjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JDBCtest2 {
   public static void main(String[] args) throws Exception {
//      Scanner scan = new Scanner(System.in);
////      System.out.println("부서번호 : ");
//      System.out.println("입사년도 : ");
//      int deptId = scan.nextInt();
//
//      while (deptId != 0) {
//         List<Emp> list = EmpDAO.getEmpListByDeptId(deptId);
//         for (Emp emp : list) {
//            System.err.println(emp);
//         }
////         System.out.print("부서번호(0은 종료):");
//         deptId = scan.nextInt();
//      }

      Scanner scan = new Scanner(System.in);
      System.out.print("입사년도 : ");
      int hireYear = scan.nextInt();

      while (hireYear != 0) {
         List<Emp> list = EmpDAO.getEmpListByHireYear(hireYear);
         for (Emp e : list) {
            System.out.println(e);
         }
         System.out.print("부서번호(0은 종료):");
         hireYear = scan.nextInt();
      }

   } // main

} // end

// 부서번호를 전달받아서 부서원정보를 리턴함

// 이름? 매개변수? 리턴타입?
// getEmployeeInfo, getInfo,
// getEmpListByDeptID
// int deptId
// List