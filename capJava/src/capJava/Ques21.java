package capJava;

import java.util.*;

public class Ques21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		InputArr.inputArray(arr, n);
		int [] ans = revRead(arr, n);
		for(int i = 0 ; i < n ; i++)
			System.out.println(ans[i]);
	}
	public static int [] revRead(int arr[], int n) {
		int ans [] = new int[n];
		for(int i = 0 ; i < n ; i++)
			ans[n - i - 1] = arr[i];
		return ans;
	}
}
