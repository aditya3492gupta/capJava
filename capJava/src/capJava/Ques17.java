package capJava;

import java.util.Scanner;

public class Ques17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		InputArr.inputArray(arr, n);
		System.out.println(maxFirst(arr, n));
	}

	public static int maxFirst(int[] arr, int n) {
		int mx = Integer.MIN_VALUE;
		for (int i = 0; i < n / 2; i++)
			if (mx < arr[i])
				mx = arr[i];
		return mx;
	}
}
