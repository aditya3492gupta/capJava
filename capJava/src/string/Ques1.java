package string;

import java.util.Scanner;

public class Ques1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int freq[] = new int[26];
		for(int i = 0 ; i < n ; i++) {
			freq[s.charAt(i) - 'a']++;
		}
		int cnt = 0;
		int flag = 0;
		for(int i : freq) {
			if(i != 0) {
				if(flag == 0) {
					cnt = i;
					flag = 1;
					continue;
				}
				if(cnt != i) {
					System.out.println(false);
					return;
				}
			}
		}
		System.out.println(true);
	}
}
