package dataStructure;

import java.util.*;

public class TryResource {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
