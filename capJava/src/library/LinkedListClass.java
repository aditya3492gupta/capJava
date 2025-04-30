package library;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList<Teacher> ll = new LinkedList<Teacher>();
		ll.add(new Teacher("abc",1,5));
		System.out.println(ll.peek().name);
		System.out.println(ll.element().exp);
//		ArrayDeque<Teacher> q = new ArrayDeque<Teacher>();
		
		java.util.Queue<Integer>q = new ArrayBlockingQueue<>(2);
		q.add(10);
		q.add(20);
//		q.add(30);  exception
		System.out.println(q.offer(30));
	}
}

class Teacher {
	String name;
	int id;
	int exp;

	public Teacher(String name, int id, int exp) {
		this.name = name;
		this.id = id;
		this.exp = exp;
	}
}