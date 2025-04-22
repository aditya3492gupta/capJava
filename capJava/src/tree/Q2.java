package tree;

import java.util.*;

public class Q2 {
	public static void main(String[] args) {

		String arr[][] = {{"SAT-01","12:00:01","SIG-AB123"},{"SAT-02","12:00:02","SIG-X9873"},{"SAT-03","12:00:03","SIG-YY451"},{"SAT-04","12:00:04","SIG-ZZ002"},{"SAT-05","12:00:05","SIG-X9873"}};
		int n = arr.length;
		int m = arr[0].length;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i][2].equals("SIG-X9873")) {
				System.out.println("{\"" + arr[i][0] + "\", \"" + arr[i][1]+ "\", \"" + arr[i][2] +"\"}");
			}
		}
//		System.out.println(Arrays.deepToString(arr));
	}
}
