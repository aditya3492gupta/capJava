package annotationPack;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD) // for methods
//@Target(ElementType.TYPE)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface CustomAnno {
	int times();
}
