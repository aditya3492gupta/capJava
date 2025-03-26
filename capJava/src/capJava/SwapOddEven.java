package capJava;

import java.util.Arrays;
import java.util.Scanner;

public class SwapOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		swapoe(arr, n);
	}

	public static void swapoe(int arr[], int n) {
		if (n % 2 == 1) {
			for (int i = 1; i < n - 1; i++) {
				if (i % 2 == 1)
					swapEle(arr, i);
			}
		} else {
			for (int i = 1; i < n-1; i++) {
				if (i % 2 == 1)
					swapEle(arr, i);
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void swapEle(int arr[], int id) {
		int temp = arr[id];
		arr[id] = arr[id + 1];
		arr[id + 1] = temp;
	}
}
