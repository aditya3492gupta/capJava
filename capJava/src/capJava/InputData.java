package capJava;
import java.util.Scanner;
public class InputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n0 :");
		int n0 = ip.nextInt();
		System.out.println(n0);
		System.out.println("Enter n1 :");
		long n1 = ip.nextLong();
		System.out.println(n1);
		System.out.println("Enter n2 :");
		byte n2 = ip.nextByte();
		System.out.println(n2);
		System.out.println("Enter n3 :");
		short n3 = ip.nextShort();
		System.out.println(n3);
		System.out.println("Enter n4 :");
		double n4 = ip.nextDouble();
		System.out.println(n4);
		System.out.println("Enter n5 :");
		boolean n5 = ip.nextBoolean();
		System.out.println(n5);
	}

}
