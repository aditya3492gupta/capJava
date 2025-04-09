package exception;

import java.util.*;

public class InvalidAgeDriver {
//	public static void main(String[] args) throws Exception/Throwable { for checked exception
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new InvalidAge();
			} else {
				System.out.println("good to go");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Thank you");
		}
	}
}
