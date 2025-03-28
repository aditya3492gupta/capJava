package capJava;

public class Employee {
	String empName;
	int empAge;
	int empPhone;
	int empId;
	String empCity;

	Employee(String empName, int empAge) {
		this.empName = empName;
		this.empAge = empAge;
	}

	Employee(String empName, int empAge, int empPhone) {
		this(empName, empAge);
		this.empPhone = empPhone;
	}

	Employee(String empName, int empAge, int empPhone, int empId, String empCity) {
		this(empName, empAge, empPhone);
		this.empId = empId;
		this.empCity = empCity;
	}

	void printData() {
		if (this.empName != null)
			System.out.println(this.empName);
		if (this.empAge != 0)
			System.out.println(this.empAge);
		if (this.empPhone != 0)
			System.out.println(this.empPhone);
		if (this.empId != 0)
			System.out.println(this.empId);
		if (this.empCity != null)
			System.out.println(this.empCity);
		System.out.println("==================");
	}
}
