package capJava;

import java.util.Arrays;

public class ArrayMethod {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		int[] arr3 = merge(arr1, arr2);
		for (int i = 0; i < arr1.length + arr2.length; i++)
			System.out.println(arr3[i]);
		System.out.println(Arrays.toString(arr3));
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
			arr3[arr1.length + i] = arr2[i];
		}
		return arr3;
	}
}
