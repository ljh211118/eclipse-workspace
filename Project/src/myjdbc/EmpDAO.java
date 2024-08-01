package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

   public static List<Emp> getEmpListBydeptId(int deptId) throws Exception {
      List<Emp> result = new ArrayList<Emp>();
      Connection con = DBUtil.getConnection();
      Statement stmt = con.createStatement();
      String sql = "select * from employees where year(hire_date) = " + deptId;
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
         int salary = rs.getInt("salary");
         String lastName = rs.getString("last_name");
//         emp.salary = salary;
//         emp.lastName = lastName;
         Emp emp = new Emp(salary, lastName);
         result.add(emp);
      }
      return result;
   } // deptId

   public static List<Emp> getEmpListByHireYear(int hireYear) throws Exception {
      List<Emp> result = new ArrayList<Emp>();
      Connection con = DBUtil.getConnection();
      Statement stmt = con.createStatement(); 
      String sql = "select hire_date, last_name, salary from employees where Year(hire_date) =" + hireYear;
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
         int salary = rs.getInt("salary");
         String lastName = rs.getString("last_name");
         String hireDate = rs.getString("hire_date");
         Emp emp = new Emp();
         emp.salary = salary;
         emp.lastName = lastName;
         emp.hireDate = hireDate;
         result.add(emp);
      }
      return result;
   } //HireYear

   public static List<Emp> getEmpListByLastName(String name) throws Exception {
      List<Emp> result = new ArrayList<Emp>();
      Connection con = DBUtil.getConnection();
      String sql = "select employee_id, last_name, salary from employees where last_name = ?";
      PreparedStatement pstmt = con.prepareStatement(sql);
      pstmt.setString(1, name);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
    	 String lastName = rs.getString("last_name"); 
         int salary = rs.getInt("salary");
         int employee_id = rs.getInt("employee_id");
         Emp emp = new Emp();
         emp.employee_id = employee_id;
         emp.lastName = lastName;
         emp.salary = salary;
         result.add(emp);
      }
      return result;
   } // LastName

} //end

//      List<Emp> result = new ArrayList<Emp>();
//      Class.forName("com.mysql.cj.jdbc.Driver");
//         //com.mysql.cj.jbdc.ConnectionIml이라는 클래스를 객체생성하여 리턴한다.
//      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "rootroot");
//      System.out.println(con.getClass().getName());
//      Statement stmt = con.createStatement(); //커넥션 인터페이스에 선언된 리턴타입이 스테이트먼트인 메서드
//      String sql = "select * from employees where department_id = " + deptId;
//      ResultSet rs = stmt.executeQuery(sql);
//      while (rs.next()) {
//         int salary = rs.getInt("salary");
//         String lastName = rs.getString("last_name");
//         String hireDate = rs.getString("hire_date");
//         
//         Emp emp = new Emp();
//         emp.salary = salary;
//         emp.lastName = lastName;
//         emp.hireDate = hireDate;
//         result.add(emp);
//         }
//         return result;