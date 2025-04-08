package string;

import java.util.*;
public class LastId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a = sc.next().charAt(0);
		findIndexLast(s,a);
	}
	public static void findIndexLast(String s, char a) {
		int n = s.length();
		for(int i = n - 1 ; i >= 0; i--) {
			if(s.charAt(i) == a) {
				System.out.println(i);
				return;
			}
		}
	}
}
