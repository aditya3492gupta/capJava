package capJava;

import java.util.Iterator;

public class EvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int[5];
		for(int i = 0 ; i < arr.length ; i++)
			arr[i] = i;
		for(int i = 0 ; i < 5 ; i+=2)
			System.out.println(arr[i]);
	}

}
