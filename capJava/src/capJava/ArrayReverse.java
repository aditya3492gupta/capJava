package capJava;

import java.util.*;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter num");

		for (int i = 0; i < 5; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < 5; i++)
			arr[i] = reverseNum(arr[i]);

		for (int i = 0; i < 5; i++)
			System.out.println(arr[i]);
	}

	public static int reverseNum(int n) {
		int ans = 0;
		while (n > 0) {
			ans = ans * 10 + n % 10;
			n /= 10;
		}
		return ans;
	}

}
