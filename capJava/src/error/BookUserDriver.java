package error;

import java.util.*;

public class BookUserDriver {
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
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - price, 2 - title, 3 - Rating");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Arrays.sort(arr);
			break;
		case 2:
			Arrays.sort(arr, new TitleComparator());
			break;
		case 3:
			Arrays.sort(arr, new RatingComparator());
			break;
		default:
			System.out.println("Invalid input");
		}
		for (Book i : arr) {
			System.out.println(i);
		}

	}
}
