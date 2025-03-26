package capJava;

import java.util.Arrays;
import java.util.Scanner;

public class Ques31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		revFirst(arr, n);
	}
	public static void revFirst(int arr[], int n) {
		int temp = n / 2;
		for(int i = 0 ; i < temp / 2 ;i++) {
			int x = arr[i];
			arr[i] = arr[temp - i - 1];
			arr[temp - i - 1] = x;
		}
		System.out.println(Arrays.toString(arr));
	}
}
