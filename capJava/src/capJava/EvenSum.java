package capJava;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int temp = 0;
		while (n1 > 0) {
			int a = n1 % 10;
			if(a % 2 == 0)
				temp += a;
			n1 /= 10;
		}
		System.out.println(temp);
	}

}
