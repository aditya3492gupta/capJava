package tree;

import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 2;
		String arr[] = { "a:80:20:30:88:70:35", "b:80:80:30:35:80:30" };
//		sc.nextLine();
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextLine();
//			sc.nextLine();
//		}
		String name[] = new String[n];
		double percent[] = new double[n];
		for (int i = 0; i < n; i++) {
			int nameIndex = arr[i].indexOf(":");
			String mark = arr[i].substring(nameIndex + 1);
			String marks[] = mark.split(":");
			name[i] = arr[i].substring(0, nameIndex);
			int totalMarks = 0;
			for (int j = 0; j < 6; j++) {
				totalMarks += Integer.valueOf(marks[j]);
			}
			percent[i] = (totalMarks / 600.0) * 100;
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Name: " + name[i] + " Percentage: " + percent[i]);
		}
	}
}
