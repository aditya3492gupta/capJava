package capJava;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee("abc", 25, 9545464);
		e1.printData();
		Employee e2 = new Employee("def", 55, 95464, 2, "hjz");
		e2.printData();
	}
}
