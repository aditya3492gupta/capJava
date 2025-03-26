package capJava;

import java.util.Scanner;

public class Ques23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		InputArr.inputArray(arr, n);
		secondRev(arr, n);
	}

	public static void secondRev(int arr[], int n) {
		for (int i = n - 1; i >= n / 2; i--)
			System.out.println(arr[i]);
	}
}
