package main.java.desiignguru.stacks;

import java.util.Stack;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(18));
    }
    public static String binaryToDecimal(int num){
        Stack<Integer> stack =  new Stack<>();
        while(num > 0){
            stack.push(num % 2);
            num /= 2;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
