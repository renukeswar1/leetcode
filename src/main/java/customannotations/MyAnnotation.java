package main.java.customannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "default";

    String TIME_CONSTANT = "SECONDS";

    String[] items();
}
