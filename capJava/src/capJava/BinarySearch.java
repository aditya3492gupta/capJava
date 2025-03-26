package capJava;

import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int key = sc.nextInt();
		int ans = search(arr, key);
		System.out.println(ans);
	}
	public static int search(int arr[], int key) {
		int ans = -1;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == key) {
				ans = key;
				break;
			}
		}
		return ans;
	}
}
