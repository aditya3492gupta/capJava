package capJava;

import java.util.*;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int i = 1;
		while (i <= (n1 / 2)) {
			if (n1 % i == 0)
				System.out.println(i);
			i++;
		}
		System.out.println(n1);
	}

}
