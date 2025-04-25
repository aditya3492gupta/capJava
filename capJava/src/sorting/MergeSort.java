package sorting;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int arr[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}
	public static void merge(int arr[], int start, int mid, int end) {
		int temp[] = new int[end - start + 1];
		int k = 0;
		int i = start;
		int j = mid + 1;
		while (i <= mid && j <= end) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= end) {
			temp[k++] = arr[j++];
		}
		for (int l = 0; l < k; l++) {
			arr[start + l] = temp[l];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 3,  8, 0, -1 };
		mergeSort(arr, 0, 4);
		System.out.println(Arrays.toString(arr));
	}
}
