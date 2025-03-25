package capJava;

import java.util.*;

public class AlphaCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		check(ch);
	}

	public static void check(char ch) {
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'U' || ch == 'u') {
			System.out.println("Vowel");
		} else
			System.out.println("Consonant");

	}

}
