package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JDBCMain {
   public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      System.out.println("부서번호 : ");
      int deptId = scan.nextInt();

      while (deptId != 0) {
         List<Emp> list = getEmpListByDeptId(deptId);
         for (Emp emp : list) {
            System.out.println(emp);
         }
         System.out.print("부서번호(0은 종료):");
         deptId = scan.nextInt();
      }
      
      Scanner scan = new Scanner(System.in);
      System.out.println("직원명(입력없으면 종료): ");
      String name = scan.nextLine();
      while(name!=null) {
         List<Emp> list = EmpDAO.getEmpListByLastName(name);
         for(Emp emp : list) {
            System.out.println(emp);
         }
         System.out.print("직원명(입력없으면 종료):");
         name = scan.nextLine();
      }
      
      // 부서번호를 전달받아서 부서원정보를 리턴함

      // 이름? 매개변수? 리턴타입?
      // getEmployeeInfo, getInfo,
      // getEmpListByDeptID
      // int deptId
      // List

   }

   public static List<Emp> getEmpListByDeptId(int deptId) throws Exception {
      List<Emp> result = new ArrayList<Emp>();
      Class.forName("com.mysql.cj.jdbc.Driver");
      // com.mysql.cj.jbdc.ConnectionIml이라는 클래스를 객체생성하여 리턴한다.
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "rootroot");
      System.out.println(con.getClass().getName());
      Statement stmt = con.createStatement(); // 커넥션 인터페이스에 선언된 리턴타입이 스테이트먼트인 메서드
      String sql = "select * from employees where department_id = " + deptId;
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
         int salary = rs.getInt("salary");
         String lastName = rs.getString("last_name");
         Emp emp = new Emp();
         emp.salary = salary;
         emp.lastName = lastName;
         result.add(emp);
      }
      return result;

   }

}
