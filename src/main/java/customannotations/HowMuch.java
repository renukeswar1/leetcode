package main.java.customannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface HowMuch {
    String currency() default "INR";
    int amount() default 1000;
}
