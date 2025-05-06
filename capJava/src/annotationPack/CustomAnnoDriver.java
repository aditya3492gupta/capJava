package annotationPack;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

public class CustomAnnoDriver {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Dog d = new Dog();
		Class c = d.getClass();
//		for method annotation
//		Method [] methods = c.getDeclaredMethods();
//		for(Method m : methods) {
//			if(m.isAnnotationPresent(CustomAnno.class)) {
//				m.invoke(d);
//			}
//		}
		
		
		Method [] methods = c.getDeclaredMethods();
		for(Method m : methods) {
			if(m.isAnnotationPresent(CustomAnno.class)) {
				Annotation a = m.getAnnotation(CustomAnno.class);
//				CustomAnno a = m.getAnnotation(CustomAnno.class);
				CustomAnno v = (CustomAnno)a;
				for(int i = 1; i <= v.times(); i++) {
					m.invoke(d);
				}
			}
		}
		
//		for class annotation
//		if(c.isAnnotationPresent(CustomAnno.class)) {
//			Method [] methods = c.getDeclaredMethods();
//			for(Method m : methods) {
//				m.invoke(d);
//			}
//		}
	}
}
