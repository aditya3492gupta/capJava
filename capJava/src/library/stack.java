package library;
import java.util.*;
public class stack {
	public static void main(String[] args) {
		Stack<Student> st = new Stack<Student>();
		st.push(new Student("abc", 12, 88));
		st.push(new Student("cbc", 15, 48));
		st.push(new Student("dbc", 16, 81));
		st.push(new Student("zzc", 10, 30));
		System.out.println(st.peek().age);
		st.pop();
		System.out.println(st.size());
		System.out.println(st.search(new Student("abc",12,88)));
	}
}
class Student{
	String name;
	int age;
	int mark;
	public Student(String name, int age, int mark) {
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, mark, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && mark == other.mark && Objects.equals(name, other.name);
	}
	
}