package java8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RapiDemo {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Test t = new Test();
		Class c = t.getClass();
		Field[] allTheVariable = c.getDeclaredFields();
		for (Field f : allTheVariable) {
			System.out.println(f.getName());
		}

		Method[] allMethods = c.getDeclaredMethods();
		for (Method m : allMethods) {
			System.out.println(m.getName());
			m.invoke(t);
		}
		
		Constructor[]cons = c.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con.getName());
		}
	}
}

class Test {
	int k;
	int i;
	static {
		int a = 10;
	}

	static int t;
	private int data = 10;

	public int getData() {
		int xl = 10;
		return this.data;
	}
	void print() {
		System.out.println("hi");
	}
	public Test() {
		
	}
}
