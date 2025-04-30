package java8;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExp {
	public static void main(String[] args) {
//		Task add = (a, b) -> (a + b);
//		Task sub = (int a,int b) -> (a - b);
//		Task mul = (a, b) -> (a * b);
//		Task div = (a,b) ->{
//			return a / b;
//		};
//		System.out.println(add.action(2, 5));
//		System.out.println(mul.action(2, 5));
//		System.out.println(sub.action(2, 5));
//		System.out.println(div.action(10, 5));

//		m1(() -> System.out.println("hahaha"));
//		m1(() -> System.out.println(10 + 20));

		Integer[] arr = { 10, 45, 5, 8, -15 };
		Comparator<Integer> i = (a, b) -> b - a;
		Arrays.sort(arr, (a, b) ->{
		System.out.println("hahaha");	
		return b - a;
		}
	);
		Arrays.sort(arr, i);
		System.out.println(Arrays.toString(arr));

	}

	public static void m1(Task t) {
		t.action();
	}
}

interface Task {
	void action();
}