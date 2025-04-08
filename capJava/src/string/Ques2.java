package string;

import java.util.Scanner;

public class Ques2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Fi_er";
//		sc.nextLine();
		String s2 = "Fever:Filer:filter:fibre:Fixer:fiber:tailor:offer";
		int cnt = 0;
		int n = s.length();
		int m = s2.length();
		int under = 0;
		String [] temp =s2.split(":");
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) == '_') {
				under = i;
				break;
			}
		}
		for(String i : temp) {
//			System.out.println(i.substring(under+1,n).toLowerCase());
			if(s.length() != i.length())
				continue;
//			System.out.println(i);
			if((s.substring(0, under).toLowerCase()).equals(i.substring(0,under).toLowerCase()) && ((i.substring(under+1,n).toLowerCase()).equals((s.substring(under+1,n).toLowerCase()))))
				System.out.println(i);
		}
		
	}
	`
}
