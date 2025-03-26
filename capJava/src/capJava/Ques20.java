package capJava;

import java.util.Scanner;

public class Ques20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		InputArr.inputArray(arr, n);
		System.out.println(avgSecond(arr, n));
	}

	public static float avgSecond(int[] arr, int n) {
		float ans = 0;
		int sum = 0;
		for (int i = n / 2; i < n; i++)
			sum += arr[i];
		if (n % 2 == 1)
			ans = sum / ((n / 2) + 1);
		else
			ans = sum / (n / 2);
		return ans;
	}
}
