package capJava;

public class NonStaticInit {
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		System.out.println("in main");
		new NonStaticInit();
		System.out.println("===========");
		new NonStaticInit();
		System.out.println("===========");
		new NonStaticInit();
	}
	{
		System.out.println("hi1");
	}
	{
		System.out.println("hi2");
	}
}


/*
 
 {
 	multi-line
 }
 
 {single line}
 
 */