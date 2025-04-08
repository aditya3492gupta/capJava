package string;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = "Hello"; 
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str3);
		str1.concat("Hi");
		System.out.println(str1);
		str1 += "bye";
		System.out.println(str1);
		
		System.out.println("-------------");
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		System.out.println("-------------");
		
		StringBuffer s3 = new StringBuffer("hello");
		StringBuffer s4 = new StringBuffer("hello");
//		s3.append(s4);
		System.out.println(s3.equals(s4));
		
	}
}
