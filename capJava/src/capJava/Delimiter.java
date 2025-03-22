package capJava;
import java.util.*;
public class Delimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "10:20:30";
		Scanner sc = new Scanner(str);
		sc.useDelimiter(":");
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
	}

}
