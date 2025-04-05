package abstraction;

public class CalcDriver {
	public static void main(String[] args) {
		Calc c = new AdvCalc();
		System.out.println(c.calculate(5, 5, '/'));
	}
}
