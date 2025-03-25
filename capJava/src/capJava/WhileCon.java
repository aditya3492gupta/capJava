package capJava;
import java.util.*;
public class WhileCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(int i = n1 ; i < n2 ; i++)
			isPrime(i);
	}
	public static void isPrime(int n1) {
		int i = 1;
		int cnt = 0;
		while (i <= n1) {
			if (n1 % i == 0) {
				cnt++;
			}
			i++;
		}
		if(cnt == 2)
			System.out.println(n1);
	}

}
