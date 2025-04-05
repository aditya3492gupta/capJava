package abstraction;

public class BasicCalc extends Calc {
	public double calculate(double a, double b, char operator) {
		if (operator == '+')
			return a + b;
		else if (operator == '-')
			return a - b;
		else if (operator == '*')
			return a * b;
		else
			return a / b;
	}
}
