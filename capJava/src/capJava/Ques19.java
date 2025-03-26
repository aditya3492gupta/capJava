package capJava;

import java.util.Scanner;

public class Ques19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		InputArr.inputArray(arr, n);
		System.out.println(avgFirst(arr, n));
	}

	public static float avgFirst(int[] arr, int n) {
		float ans = 0;
		int sum = 0;
		for (int i = 0; i < n / 2; i++)
			sum += arr[i];
		ans = (float) sum / (n / 2);
		return ans;
	}
}
