package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

public class ALinro {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(30);
		al1.add(40);
		al1.add(1, 50);
		System.out.println(al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(800);
		al2.add(100);
		al2.add(900);
		System.out.println(al2);
		al1.addAll(2, al2);
		System.out.println(al1);
		Integer dataToBeRemoved = 10;
		al1.remove(dataToBeRemoved);
		System.out.println(al1);
//		al1.removeAll(al2);
//		al1.retainAll(al2);
//	`	System.out.println(al1);
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("abc", 45, 45));
		list.add(new Student("bbc", 345, 245));
		list.add(new Student("abs", 645, 745));
		list.add(new Student("asd", 3453, 425));
		System.out.println(list);
//		list.remove(new Student("abs", 645, 745));
//		System.out.println(list);
		
		
		
//		for (int i = 0; i < list.size(); i++) {
//			Student s = list.get(i);
//			if (s.mark < 100) {
//				list.remove(i);
//			}
//		}
		
		
		
		
//		Iterator<Student> i = list.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//			i.remove();
//		}
		
		
		
		
		ListIterator<Student> i = list.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
//		System.out.println(list);
	}
}

class Student {
	String name;
	int roll;
	int mark;

	public Student(String name, int roll, int mark) {
		super();
		this.name = name;
		this.roll = roll;
		this.mark = mark;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mark, name, roll);
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
		return mark == other.mark && Objects.equals(name, other.name) && roll == other.roll;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", mark=" + mark + "]\n";
	}

}
