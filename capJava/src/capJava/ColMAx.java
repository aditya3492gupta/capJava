package capJava;

import java.util.Scanner;

public class ColMAx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				arr[i][j] = sc.nextInt();
		maxCol(arr, n, m);
	}
	public static void maxCol(int arr[][], int n, int m) {
		for(int i = 0 ; i < n ; i++) {
			int mx = Integer.MIN_VALUE;
			for(int j = 0 ; j < m ; j++) {
				if(mx < arr[j][j])
					mx = arr[j][i];
			}
			System.out.println(mx);
		}
	}
}
