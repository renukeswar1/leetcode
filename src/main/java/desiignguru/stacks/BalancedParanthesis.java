package main.java.desiignguru.stacks;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[}]";
        BalancedParanthesis balancedParanthesis = new BalancedParanthesis();
        boolean valieParanthesis = balancedParanthesis.isValieParanthesis(test1);
        System.out.println(valieParanthesis);

        boolean valieParanthesis2 = balancedParanthesis.isValieParanthesis(test2);
        System.out.println(valieParanthesis2);
    }
    public boolean isValieParanthesis(String a){
        Stack<Character> stack = new Stack<>();
        char[] array = a.toCharArray();
        for(char c: array){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char ele = stack.pop();
                if(c == '}' && ele != '{')
                    return false;
                if(c == ']' && ele != '[')
                    return false;
                if(c == '(' && ele != ')')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
