package capJava;

import java.util.Arrays;
import java.util.Scanner;

public class Ques30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextLine();
		revStr(arr, n);
	}
	public static void revStr(String arr[], int n) {
		for(int i = 0 ; i < n /2  ; i++) {
			String temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
