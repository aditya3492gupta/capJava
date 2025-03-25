package capJava;

public class CopyArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			newArray[i] = arr[i];
		newArray[0] = 100;
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		System.out.println("===============================");
		for (int i = 0; i < arr.length; i++)
			System.out.println(newArray[i]);

	}
}
