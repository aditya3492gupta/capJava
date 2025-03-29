package capJava;

import java.util.*;

public class Ques5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		int i, j;
		int ans = 0;
		int mid;
		if (n % 2 == 0) {
			i = n / 2;
			mid = arr[i];
			j = n / 2 + 1;
			if (arr[i] != arr[j]) {
				arr[i] = arr[j];
				ans++;
			}
//			System.out.println("E");
			i--;
			j++;
		} else {
			i = n / 2 - 1;
			j = n / 2 + 1;
			mid = arr[n / 2];
//			System.out.println("O");
		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(i);
//		System.out.println(j);
		while (i >= 0 && j < n) {
			if (arr[i] != mid - 1) {
				arr[i] = mid - 1;
				ans++;
//					System.out.println(arr[i]);
			}
			if (arr[j] != mid - 1) {
				arr[j] = mid - 1;
				ans++;
//					System.out.println(arr[j]);
			}

//				System.out.println(mid);
			mid--;
			i--;
			j++;
		}
		System.out.println(ans);
	}
}
