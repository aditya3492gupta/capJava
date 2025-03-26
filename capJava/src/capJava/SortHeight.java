package capJava;

import java.util.Arrays;
import java.util.Scanner;

public class SortHeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] hei = new int[n];
		for (int i = 0; i < n; i++)
			hei[i] = sc.nextInt();
		String[] name = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++)
			name[i] = sc.nextLine();
		arrange(name, hei, n);
	}
	public static void arrange(String []name, int hei[],int n ) {
		String ans[] = new String[n];
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++)
			arr[i] = hei[i];
		Arrays.sort(hei);
		for(int i = n - 1 ; i >= 0 ; i--) {
			for(int j = 0 ; j <n ; j ++) {
				if(hei[i] == arr[j]) {
					ans[i] = name[j];
					arr[j] = Integer.MAX_VALUE;
				}
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}
}
