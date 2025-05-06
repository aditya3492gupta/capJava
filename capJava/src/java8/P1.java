package java8;

import java.util.*;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int sum = 0;
		int temp = 0;
		for(int i = 0 ; i < n ; i++) {
			if(Character.isDigit(s.charAt(i))) {
				temp = temp * 10 + (s.charAt(i) - '0');
			}else {
				sum += temp;
				temp = 0;
			}
		}
		sum += temp;
		System.out.println(sum);
	}
}
