package library;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>((a, b) -> b - 1);
		q.offer(10);
		q.offer(5);
		q.offer(16);
		q.offer(12);
		q.offer(20);
		q.offer(6);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);

		Queue<Emp> pq = new PriorityQueue<Emp>(new NameComparator());
		pq.offer(new Emp("abc", 123, 20000));
		pq.offer(new Emp("ghi", 25, 27000));
		pq.offer(new Emp("def", 23, 7000));
		pq.offer(new Emp("aditya", 223, 77000));
		pq.offer(new Emp("xyz", 13, 25000));
		for (Emp e : pq) {
			System.out.println(e);
		}
//		Queue<Emp> pq = new PriorityQueue<Emp>();
//		pq.offer(new Emp("abc", 123, 20000));
//		pq.offer(new Emp("ghi", 25, 27000));
//		pq.offer(new Emp("def", 23, 7000));
//		pq.offer(new Emp("xyz", 13, 25000));
//		for (Emp e : pq) {
//			System.out.println(e);
//		}
	}
}

class NameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class Do implements Comparator<Integer> {

//	@Override
//	public int compare(Integer o1, Integer o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}

}

class Emp implements Comparable<Emp> {
	String name;
	int id;
	Double salary;

	public Emp(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public int compareTo(Emp o) {

		return o.salary.compareTo(this.salary);
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}