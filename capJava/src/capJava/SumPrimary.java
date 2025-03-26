package capJava;

import java.util.*;

public class SumPrimary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				arr[i][j] = sc.nextInt();
		diaSum(arr, n, m);
	}

	public static void diaSum(int arr[][], int n, int m) {
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i][i];
		System.out.println(sum);
	}
}
