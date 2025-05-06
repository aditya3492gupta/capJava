package appTest;

import org.junit.Test;

import app.Calc;
import org.junit.*;

public class CalcTest {
	@Test
	public void addTest() {
		Calc c = new Calc();
		System.out.println("test");
		int acResult = c.add(10, 10);
		int exResult = 20;
		Assert.assertEquals(exResult, acResult);
		Assert.assertEquals(10, c.mul(2, 5));
	}
	@Test
	public void subTest(){
		Calc c = new Calc();
		Assert.assertEquals(2, c.sub(6, 4));
	}
	@Test
	public void divTest() {
		Calc c = new Calc();
		Assert.assertEquals(2, c.div(10, 5));
	}
	
	@Test(expected = ArithmeticException.class)
	public void divTestByZero() {
		System.out.println("divide zero");
		Calc c = new Calc();
		c.div(10, 0);
	}
	
	@Before
	public void befor() {
		System.out.println("Before");
	}
	
	@After
	public void af() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforEverything() {
		System.out.println("Connected");
	}
	
	@AfterClass
	public static void afterEverything() {
		System.out.println("Disconnected");
	}
}
