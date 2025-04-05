package abstraction;

public class AdvCalc extends BasicCalc {
	public double calculate(double a, double b, char operator) {
		if (operator == '^')
			return Math.pow(a, b);
		else if (operator == '%')
			return a % b;

		return super.calculate(a, b, operator);
	}
}
