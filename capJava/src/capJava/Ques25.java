package capJava;

import java.util.Scanner;

public class Ques25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		InputArr.inputArray(arr, n);
		oddRead(arr, n);
	}

	public static void oddRead(int arr[], int n) {
		for (int i = 1; i < n; i += 2)
			System.out.println(arr[i]);
	}
}
