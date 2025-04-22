package tree;

public class BinarySearch {
	public static void main(String[] args) {
		int n = 6;
		int arr[] = { 8, 9, 23, 35, 43, 48 };
		int left = 0;
		int right = n - 1;
		int key = 98;
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] == key) {
				System.out.println(mid);
				return;
			}else if(arr[mid] < key) {
				left = mid + 1;
			}else {
				right = mid - 1; 
			}
		}
		System.out.println("Not found");
	}
}
