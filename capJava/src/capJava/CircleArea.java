package capJava;

public class CircleArea {

	public static void main(String[] args) {
		System.out.println("Area of circle is " + areaCircle(5));
		System.out.println("Area of circle is " + areaCircle(2.2));
		System.out.println("Area of circle is " + areaCircle(10));
		System.out.println("Cube is " + cubeNum(5));
		System.out.println("Cube is " + cubeNum(8));
		System.out.println("Cube is " + cubeNum(15));
		System.out.println("The number is " + parityCheck(5));
		System.out.println("The number is " + parityCheck(8));
		System.out.println("The number is " + parityCheck(6));
	}
	public static double areaCircle(double radius) {
		return 3.14 * radius * radius;
	}
	public static int cubeNum(int n) {
		return n * n * n;
	}
	public static String parityCheck(int n) {
		return n % 2 == 1 ? "Odd" : "Even";
	}
}
