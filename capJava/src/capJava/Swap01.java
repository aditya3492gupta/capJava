package capJava;

import java.util.*;

public class Swap01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int i = 0;
		int j = i+1;
		while (j < n && i < n) {
			while (arr[i] == 0)
				i++;
			while (arr[j] == 1)
				j++;
			swap(arr[i], arr[j]);
			i++;
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
