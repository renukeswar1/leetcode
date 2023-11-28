package main.java.desiignguru.stacks;

import java.util.Stack;

public class ReversedString {
    public static void main(String[] args) {
        ReversedString reversedString = new ReversedString();
        String rever = reversedString.reverseString("Renukeswar");
        System.out.println(rever);

    }
    public String reverseString(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reverse = new StringBuilder();
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }
        System.out.println(1%2);
        return reverse.toString();
    }
}
