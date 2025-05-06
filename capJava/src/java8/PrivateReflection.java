package java8;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateReflection {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException,InvocationTargetException {
		PrivateTest t = new PrivateTest();
		Class c = t.getClass();
		Field f = c.getDeclaredField("data");
		System.out.println(f);
		System.out.println(t.getData());
		f.setAccessible(true);
		f.set(t, "bye");
		System.out.println(t.getData());
		
		
		Method[] allMethods = c.getDeclaredMethods();
		for(Method m : allMethods) {
//			System.out.println(m.getName());
			System.out.println(m.getModifiers() + " " + m.getName());
			
			if(m.getName().equals("m1")) {
				m.setAccessible(true);
				m.invoke(t);
			}
		}
	}
}

class PrivateTest {
	private String data = "hahaha";

	public String getData() {
		return data;
	}

	private void m1() {
		System.out.println("m1");
	}
	
	private void m2() {
		System.out.println("m2W");
	}
	
}
