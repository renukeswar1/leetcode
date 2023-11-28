package main.java.desiignguru.stacks;

import java.util.Stack;

public class RemoveAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(RemoveAdjacentDuplicatesInString.removeDuplicatesInString("abbaxy"));
    }
    public static String removeDuplicatesInString(String s){
        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: stack){
            sb.append(c);
        }
        return  sb.toString();
    }
}
