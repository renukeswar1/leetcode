package main.java.udemydatastrcutures.interviewquestions;

import java.util.ArrayList;
import java.util.Stack;

public class StackUsingArrayList<T> {


    public static void main(String[] args) {
        String s1 = "()()()";
        String s2 = "()(()";
        String s3 = "(()())";
        StackUsingArrayList<String> s= new StackUsingArrayList<>();
       // System.out.println(s.reverseString("renu"));
        System.out.println(s.isBalancedParentheses(s2)); // true
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);
        s.sortStack(stack);

    }
    private ArrayList<T> stackList = new ArrayList<>();
    public void sortStack(Stack<Integer> inputStack){
        //3 2 5 1 4
        Stack<Integer> additionalStack = new Stack<>();
        while (!inputStack.isEmpty()){
            Integer temp = inputStack.pop();
            while(!additionalStack.isEmpty() && additionalStack.peek() > temp){
                inputStack.push(additionalStack.pop());
            }
            additionalStack.push(temp);
        }
        while (!additionalStack.isEmpty()) {
            inputStack.push(additionalStack.pop());
        }

        for (int i = inputStack.size()-1; i >= 0; i--) {
            System.out.println(inputStack.get(i));
        }
    }
    public boolean isBalancedParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        char[] c = s.toCharArray();
        for (char p : s.toCharArray()) {
            if (p == '(') {
                stack.push('(');
            } else if (p == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(T t){
        stackList.add(t);
    }
    public T pop(){
        if(stackList.size() == 0){
            return null;
        }
        return stackList.remove(stackList.size()-1);
    }
    public  String reverseString(String myString){
        Stack<Character> newStack = new Stack<>();
        if(myString.length() == 0){
            return  null;
        }
        StringBuilder sb = new StringBuilder();
        for(char c: myString.toCharArray()){
            newStack.push(c);
        }
        while(!newStack.isEmpty()){
            sb.append(newStack.pop());
        }
        return sb.toString();
    }

}
