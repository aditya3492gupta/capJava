package capJava;

import java.util.Scanner;

public class Ques22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		InputArr.inputArray(arr, n);
		firstRev(arr, n);
	}

	public static void firstRev(int arr[], int n) {
		for (int i = n / 2 ; i >= 0; i--)
			System.out.println(arr[i]);
	}
}
