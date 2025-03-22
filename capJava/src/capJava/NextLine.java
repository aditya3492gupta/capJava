package capJava;

import java.util.*;
public class NextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		String name = sc.nextLine(); //nextline would not take input, it takes the carrage
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

}
