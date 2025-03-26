package capJava;

import java.util.*;

public class InputArr {
	public static void main(String[] args) {

	}

	public static void inputArray(int []arr, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
	}
}
