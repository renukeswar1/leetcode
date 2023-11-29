package main.java.desiignguru.stacks;

import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        System.out.println(RemoveStars.removeStars("abc*de*f"));
    }
    public static String removeStars(String s){
        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()){
            if(!stack.isEmpty() && c == '*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: stack){
            sb.append(c);
        }
        return sb.toString();
    }
}
