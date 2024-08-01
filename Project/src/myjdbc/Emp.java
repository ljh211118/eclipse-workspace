package myjdbc;

public class Emp {

   int employeeId;
   int salary;
   String lastName;
   String hireDate;
   int employee_id;


   public Emp() {

   }

   public Emp(int salary, String lastName) {
      this.salary = salary;
      this.lastName = lastName;
      
   }

   @Override
   public String toString() {
      return "Emp [employeeId=" + employeeId + ", salary=" + salary + ", lastName=" + lastName + ", hireDate="
            + hireDate + "]";
   }

}
