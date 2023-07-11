package reflectionandannotation;

import java.lang.annotation.*;

@Target(value = {ElementType.TYPE, ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation { // Class
    String value() default "";
}
