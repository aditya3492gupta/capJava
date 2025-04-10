package error;

import java.util.Arrays;

public class BookDriver {
	public static void main(String[] args) {
		Book arr[] = new Book[10];
		arr[0] = new Book("a", 50, 4.2);
		arr[1] = new Book("b", 30, 5.9);
		arr[2] = new Book("c", 40, 8.1);
		arr[3] = new Book("d", 60, 3.2);
		arr[4] = new Book("sjxnsd", 60, 3.8);
		arr[5] = new Book("djndc", 60, 5.2);
		arr[6] = new Book("iad", 60, 3.6);
		arr[7] = new Book("azasd", 70, 3.2);
		arr[8] = new Book("apjscd", 70, 3.2);
		arr[9] = new Book("sjnjsd", 50, 3.2);
		for (Book i : arr) {
			System.out.println(i);
		}
//		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, new RatingComparator());
		System.out.println("After sorting");
		for (Book i : arr) {
			System.out.println(i);
//			System.out.println(i.title + " " + i.price + " " + i.rating);
		}
//		Deprecated
//		Integer i = new Integer(5);
//		System.out.println(i);
	}
}
