package main.java.customannotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestAnnotation {
    public static void main(String[] args) {
        Home home = new Home();
        Class<? extends Home> aClass = home.getClass();
        MyAnnotation annotation = home.getClass()
                .getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
        Arrays.stream(annotation.items()).forEach(System.out::println);
        System.out.println(MyAnnotation.TIME_CONSTANT);

        try{
            Method method = aClass.getMethod("renovate");
            HowMuch annotation1 = method.getAnnotation(HowMuch.class);
            System.out.println(annotation1.amount()+":"+annotation1.currency());
        }catch(NoSuchMethodException e){
            throw  new RuntimeException("No Such method");
        }
        try{
            Field cost = aClass.getDeclaredField("homeCost");
            Range fieldAnnotations = cost.getAnnotation(Range.class);
            System.out.println(fieldAnnotations.min()+":"+fieldAnnotations.max());
        }catch (NoSuchFieldException e){
            throw new RuntimeException("No such field");
        }

    }
}

@MyAnnotation(value = "home",items = {"Bangalow","Duplex"})
class Home{
    @Range
    int homeCost;

    public Home(){
        System.out.println("Home creation");
    }
    @HowMuch(currency = "USD", amount = 200)
    public void renovate(){
        System.out.println("In renovate method");
    }
}