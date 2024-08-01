package myjdbc;

public class Emp { // 직원의 정보를 저장하는 데이터 객체
	
	int employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String hireDate;
	String jobId;
	double salary;
	double commissiontPct;
	int managerId;
	int departmentId;
	
public class departments {
	int departmentId;
	String departmentName;
	int managerId;
	int locationId;
	
}

public class countries {
	int countryId;
	String countryName;
	int regionId;
}



	
	
	

	
	
//	public Emp(int salary, String lastName) {
//		this.salary = salary;
//		this.lastName = lastName;
//		
//	}
//	
	public Emp() {
	}

	@Override
	public String toString() {
		return "Emp [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
//				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary="
				+ salary + ", commissiontPct=" + commissiontPct + ", managerId=" + managerId + ", departmentId="
				+ departmentId + "]";
	}
}
