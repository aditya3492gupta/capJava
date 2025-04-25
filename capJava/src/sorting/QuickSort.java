package sorting;

import java.util.Arrays;

public class QuickSort {
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int i = start;
		for (int j = start; j < end; j++) {
			if (arr[j] <= pivot) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, end);
		return i;
	}

	public static void quickSort(int arr[], int start, int end) {
		if (start < end) {
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot - 1);
			quickSort(arr, pivot + 1, end);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 3, 9, 8, 0, -1 };
		quickSort(arr, 0, 5);
		System.out.println(Arrays.toString(arr));
	}
}
