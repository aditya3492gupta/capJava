package capJava;

import java.util.*;

public class DupStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (mx < arr[i])
				mx = arr[i];
		int freq[] = new int[mx + 1];
		for (int i = 0; i < n; i++) {
			freq[arr[i]]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 1)
				System.out.println(i);
		}
	}
}
