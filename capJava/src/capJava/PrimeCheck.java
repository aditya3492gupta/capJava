package capJava;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		isPrime(n1);
	}
	public static void isPrime(int n1) {
		int i = 1;
		int cnt = 0;
		while (i <= n1) {
			if (n1 % i == 0) {
				cnt++;
//				System.out.println(i);
			}
			i++;
		}
//		System.out.println(n1);
		if(cnt > 2)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}

}
