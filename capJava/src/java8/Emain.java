package java8;

public class Emain {
	public static void main(String[] args) {
		System.out.println("in main");
		NewDemo d = (name, id, std) -> {
			return new Student(name, id, std);
		};
		d.getDetails("abc", 4, 5);
//		Student s = new Student("xdc", 5, 6);
		NewDemo d1 = Student::new;
	    Student s2 = d1.getDetails("xyz", 1, 10);
		
	}

}

interface NewDemo {
	public Student getDetails(String name, int id, int std);
}

class Student {
	String name;
	int id;
	int std;

	public Student(String name, int id, int std) {
		this.name = name;
		this.id = id;
		this.std = std;
		System.out.println(this.name + " " + this.id + " " + this.std);
	}

}