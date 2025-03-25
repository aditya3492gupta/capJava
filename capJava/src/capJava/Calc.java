package capJava;

import java.util.*;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter second number:");
		int n2 = sc.nextInt();
		System.out.println("Enter operation ");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case '+':
			System.out.println(n1 + n2);
			break;
		case '-':
			System.out.println(n1 - n2);
			break;
		case '*':
			System.out.println(n1 * n2);
			break;
		case '/':
			System.out.println(n1 / n2);
			break;
		default:
			System.out.println(-1);
		}
	}

}
