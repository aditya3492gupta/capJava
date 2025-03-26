package capJava;

import java.util.*;

public class MergeArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter for 1");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter for 2");
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		for (int i = 0; i < m; i++)
			arr1[i] = sc.nextInt();
		merge(arr, arr1, n, m);
	}

	public static void merge(int arr[], int arr1[], int n, int m) {
		int i = 0, j = 0;
		int ans[] = new int[n + m];
		int k = 0;
		while (i < n && j < m) {
			if (arr[i] < arr1[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			} else {
				ans[k] = arr1[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while (j < m) {
			ans[k] = arr1[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(ans));
	}

}
