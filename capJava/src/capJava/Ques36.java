package capJava;

import java.util.Arrays;
import java.util.Scanner;

public class Ques36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		rightShift(arr, n);
	}
	public static void rightShift(int arr[], int n) {
		int last = arr[n - 1];
		int temp;
		for(int i = n-1 ; i >0 ; i--) {
			
			arr[i] = arr[i - 1];
			
		}
		arr[0] = last;
		System.out.println(Arrays.toString(arr));
	}
}
