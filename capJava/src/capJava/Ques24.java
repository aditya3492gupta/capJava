package capJava;

import java.util.Scanner;

public class Ques24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		InputArr.inputArray(arr, n);
		evenRead(arr, n);
	}
	public static void evenRead(int arr[], int n) {
		for (int i = 0; i < n; i+=2)
			System.out.println(arr[i]);
	}
}
