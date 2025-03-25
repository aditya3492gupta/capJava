package capJava;

import java.util.*;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		while (n1 > 9) {
			n1 = digitSum(n1);
		}
		System.out.println(n1);
	}
	public static int digitSum(int n1) {
		int temp = 0;
		while (n1 > 0) {
			temp += (n1 % 10);
			n1 /= 10;
		}
		return temp;
	}

}
