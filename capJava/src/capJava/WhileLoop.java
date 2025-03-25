package capJava;

import java.util.*;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int ans = 0;
		while (n1 > 0) {
			int rem = n1 % 10;
			ans = ans * 10 + rem;
			n1 /= 10;
		}
		System.out.println(ans);

	}

}
