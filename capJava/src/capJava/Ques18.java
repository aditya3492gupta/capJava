package capJava;

import java.util.Scanner;

public class Ques18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		InputArr.inputArray(arr, n);
		System.out.println(maxSecond(arr, n));
	}

	public static int maxSecond(int[] arr, int n) {
		int mx = Integer.MIN_VALUE;
		for (int i = n / 2; i < n; i++)
			if (mx < arr[i])
				mx = arr[i];
		return mx;
	}
}
