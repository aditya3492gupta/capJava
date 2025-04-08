package string;

import java.util.Scanner;

public class ReplaceStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		replace(s, a, b);
	}

	public static void replace(String s, char a, char b) {
		int n = s.length();
		StringBuffer ans = new StringBuffer();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == a) {
				ans.append(b);
			} else
				ans.append(s.charAt(i));
		}
		System.out.println(ans);
	}
}
