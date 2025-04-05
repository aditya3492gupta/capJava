package abstraction;

public class ICalcDriver {
	public static void main(String[] args) {
		ICalc c = new IBasicCalc();
		System.out.println(c.calculate(5, 5, '+'));
	}
}
