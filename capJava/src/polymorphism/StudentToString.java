package polymorphism;

public class StudentToString {
	String name;
	int rollNo;

	public StudentToString(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String toString() {
		String data = "[ Name " + this.name + " ] ";
		return data;
	}
	
}
