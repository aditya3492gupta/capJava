package abstraction;

public class IBasicCalc implements ICalc{
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
