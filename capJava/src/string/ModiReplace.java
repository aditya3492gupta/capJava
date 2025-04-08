package string;

public class ModiReplace {
	public static void main(String[] args) {
		String s = "hi hello world!";
		String s1 = s.replace('o', 'a');
		System.out.println("Replace " + s.replace('o', 'a'));
		System.out.println(s1);
		System.out.println(s);

		System.out.println("------------------");

		String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
		String regex = "(?i)cat";
		System.out.println(myStr);
		System.out.println("replace all " + myStr.replaceAll(regex, "dog"));
		System.out.println(myStr);

		System.out.println("------------------");

		System.out.println("replace first " + myStr.replaceFirst(regex, "dog"));

		System.out.println("------------------");

		System.out.println("toLower " + myStr.toLowerCase());
		System.out.println(myStr);

		System.out.println("------------------");

		System.out.println("toUpper " + s.toUpperCase());

		System.out.println("------------------");

		int n = s.length();
		toUpperCase(s, n);

		System.out.println("------------------");

		String str1 = "I LOVE JAVA";
		String[] strArr = str1.split(" ");
		for (String a : strArr) {
			System.out.println(a);
		}

		System.out.println("------------------");
		
		System.out.println("to char array" + s.toCharArray());

	}

	public static void toUpperCase(String s, int n) {
		StringBuffer s1 = new StringBuffer();
		for (int i = 0; i < n; i++) {
			char a = s.charAt(i);
			if (a >= 'a' && a <= 'z') {
				s1.append((char) (a - 'a' + 'A'));
			} else {
				s1.append(a);
			}
		}
		System.out.println("my toUpperCase " + s1);
	}

}
