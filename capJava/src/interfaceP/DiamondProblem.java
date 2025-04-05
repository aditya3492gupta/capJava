package interfaceP;

public class DiamondProblem implements P1, P2 {
	public static void main(String[] args) {
		System.out.println(P1.k);
		System.out.println(P2.k);
		P1.m1();
	}
}

interface P1 {
	int k = 20;
	static void m1() {
		System.out.println("P1 Method");
	}
}

interface P2 {
	int k = 10;

	static void m1() {
		System.out.println("P2 Method");
	}
}
