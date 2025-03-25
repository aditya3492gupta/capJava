package capJava;

import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int temp = 0;
		while (n1 > 0) {
			int rem = n1 % 10;
			temp = temp * 10 + rem;
			n1 /= 10;
		}
		int ans = 0;
		while (temp > 0 && n2 > 0) {
			int a = temp % 10;
			int b = n2 % 10;
			ans = ans * 10 + a;
			ans = ans * 10 + b;
			temp /= 10;
			n2 /= 10;
		}
		while (temp > 0) {
			int a = temp % 10;
			ans = ans * 10 + a;
			temp /= 10;
		}
		while (n2 > 0) {
			int a = n2 % 10;
			ans = ans * 10 + a;
			n2 /= 10;
		}
		System.out.println(ans);
	}

}
