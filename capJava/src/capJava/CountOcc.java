package capJava;

import java.util.Scanner;

public class CountOcc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		countEle(arr, n);
	}
	public static void countEle(int arr[], int n) {
		int mx = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++)
			if(mx < arr[i])
				mx = arr[i];
		int freq[] = new int[mx + 1];
		for(int i = 0 ; i < n ; i++) {
			freq[arr[i]]++;
		}
		System.out.println("Element : Frequency");
		for(int i = 0 ; i <= mx ; i++) {
			if(freq[i] > 0)
				System.out.println(i + " : " + freq[i] + " times");
		}
	}
}
