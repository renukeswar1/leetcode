package main.java.effectivejava.Item1;

public class TestStaticFactoryMethod {
    public static void main(String[] args) {
        valueOf(false);
    }
    public static Boolean valueOf(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
