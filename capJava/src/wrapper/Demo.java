package wrapper;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		Object [] arr= new Object[5];
		arr[0] = 1;
		arr[1] = false;
		arr[2]= 10.21;
		arr[3]= "String";
		arr[4] = new Object();
		System.out.println(Arrays.toString(arr));
	}
}
