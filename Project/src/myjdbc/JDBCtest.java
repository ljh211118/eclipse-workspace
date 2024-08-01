package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCtest {
   public static void main(String[] args) throws Exception {
      // throws절로 가지고 있는 메소드를 쓰려면 예외처리 해야됨.
      Class.forName("com.mysql.cj.jdbc.Driver");
      // com.mysql.cj.jbdc.ConnectionIml이라는 클래스를 객체생성하여 리턴한다.
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "rootroot");
      Statement stmt = con.createStatement(); // 커넥션 인터페이스에 선언된 리턴타입이 스테이트먼트인 메서드
      String sql = "select * from employees where department_id = 80";
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
         System.out.println(rs.getString("salary"));
      }
   }

}