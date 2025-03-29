package capJava;

import java.util.*;

public class BuyStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
		System.out.println(maxProfit(arr, n));
	}
	public static int maxProfit(int arr[],int n) {
		int ans = 0;
		int mnPrice = arr[0];
		for(int i = 1 ; i < n ; i++) {
			if(mnPrice > arr[i]) {
				mnPrice = arr[i];
			}
			ans = Math.max(ans, arr[i] - mnPrice);
		}
		return ans;
	}
}
//this - default reference variable