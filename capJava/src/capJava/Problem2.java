package capJava;
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		System.out.println(checkMultiple(n1, n2));
	}
	public static int checkMultiple(int n1, int n2) {
		if(n1 == 0 || n2 == 0)
			return 3;
		else if(n1 % n2 == 0)
			return 2;
		else
			return 1;
		
	}

}
