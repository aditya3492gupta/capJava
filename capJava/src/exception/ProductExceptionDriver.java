package exception;

import java.util.*;

public class ProductExceptionDriver {
	public static void main(String[] args) {
		String type = takeType();
		int price = takePrice();

		check(price, type);

	}

	public static void check(int price, String type) {
		while (true) {
			try {
				if (price < 0) {
					throw new ProductException();
				} else {
					System.out.println("ok price");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("give positive price");
				price = takePrice();
//				check(price, type);
			}
//			} finally {
				
//			}
		}
		System.out.println(type);
		System.out.println(price);
	}

	public static int takePrice() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static String takeType() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}
