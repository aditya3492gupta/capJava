package capJava;

import java.util.*;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter second number:");
		int n2 = sc.nextInt();
		System.out.println("Enter third number:");
		int n3 = sc.nextInt();

		int cnt = 0;
		int sum = 0;
		int product = 1;
		int singleEven = -1;

		if (n1 % 2 == 0) {
			cnt++;
			sum += n1;
			product *= n1;
			singleEven = n1;
		}
		if (n2 % 2 == 0) {
			cnt++;
			sum += n2;
			product *= n2;
			singleEven = n2;
		}
		if (n3 % 2 == 0) {
			cnt++;
			sum += n3;
			product *= n3;
			singleEven = n3;
		}

		if (cnt == 1)
			System.out.println(singleEven);
		else if (cnt == 2)
			System.out.println(sum);
		else if (cnt == 3)
			System.out.println(product);
		else if (cnt == 0)
			System.out.println(0);

	}
}
