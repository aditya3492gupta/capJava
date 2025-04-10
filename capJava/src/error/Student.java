package error;

import java.util.Arrays;

public class Student {
	public static void main(String[] args) {
		Subject arr[] = new Subject[10];
		arr[0] = new Subject(60, 51, 64);
		arr[1] = new Subject(90, 80, 80);
		arr[2] = new Subject(60, 61, 48);
		arr[3] = new Subject(48, 44, 64);
		arr[4] = new Subject(44, 45, 11);
		arr[5] = new Subject(66, 45, 51);
		arr[6] = new Subject(41, 21, 51);
		arr[7] = new Subject(55, 66, 94);
		arr[8] = new Subject(55, 66, 95);
		arr[9] = new Subject(99, 91, 100);
		for (Subject i : arr) {
			System.out.println(i);
		}
		Arrays.sort(arr);
		System.out.println("After sorting");
		for (Subject i : arr) {
			System.out.println(i);
		}
	}

}

class Subject implements Comparable {
	int math;
	int hindi;
	int english;

	public Subject(int math, int hindi, int english) {
		super();
		this.math = math;
		this.hindi = hindi;
		this.english = english;
	}

	public int compareTo(Object o) {
		Subject s = (Subject) o;
		if (this.math != s.math)
			return this.math - s.math;
		if (this.hindi != s.hindi)
			return this.hindi - s.hindi;
		return this.english - s.english;
	}

	@Override
	public String toString() {
		return "Subject [math=" + math + ", hindi=" + hindi + ", english=" + english + "]";
	}

}