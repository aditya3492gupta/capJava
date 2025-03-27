package capJava;

public class ConDriver {
	public static void main(String[] args) {
		ConStudent s1 = new ConStudent("abc", 45);
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		ConStudent s2 = new ConStudent("dfg", 54);
		System.out.println(s2.name);
		System.out.println(s2.rollNo);
	}
}
