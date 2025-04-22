package tree;

public class BinarySearchRecur {
	public static int search(int arr[], int left, int right, int key) {
		if (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] < key) {
				return search(arr, mid + 1, right, key);
			}
			if (arr[mid] > key) {
				return search(arr, left, mid - 1, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int n = 6;
		int arr[] = { 8, 9, 23, 35, 43, 48 };
		int key = 48;
		int index = search(arr, 0, n - 1, key);
		if (index == -1) {
			System.out.println("Not found");
		} else {
			System.out.println(index);
		}
	}
}
