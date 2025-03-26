package capJava;

import java.util.Arrays;
import java.util.Scanner;

public class Ques29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int id1 = sc.nextInt();
		int id2 = sc.nextInt();
		swap(arr, id1, id2);
	}
	public static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
