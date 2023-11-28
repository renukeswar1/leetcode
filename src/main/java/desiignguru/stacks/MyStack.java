package main.java.desiignguru.stacks;

import java.util.Stack;

public class MyStack<T> {
    Stack<T> stack = new Stack<>();
    public void push(T ele){
        stack.add(ele);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public T peek() throws Exception {
        if(stack.isEmpty()){
            throw new Exception("No element");
        }
        return stack.peek();
    }
    public T pop() throws Exception {
        if(stack.isEmpty()){
            throw new Exception("No element");
        }
        return stack.pop();
    }
}


class StackUsingArray<T>{
    private Object[] stack;
    private int top ;
    StackUsingArray(int size){
        stack = new Object[size];
        top =-1;
    }
    public void push(T ele){
        if(top == stack.length-1){
            throw new IndexOutOfBoundsException("Stack is full");
        }
        stack[++top] = ele;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public T peek(){
        //condition check if is empty
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Stack is full");
        }
       return (T)stack[top];
    }
    public T pop(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Stack is full");
        }
        T ele = (T) stack[top];
        stack[top--] = null;
        return ele;
    }
}
// stack overflow = if we add elements on to the stack which is already full
// stack underflow = if we try to remove element from stack which is empty

class StackUsingLinkedList<T>{
    private  Node<T> top;

    private class Node<T>{
        private T data;
        private Node<T> next;
        Node(T data){
            this.data=data;
        }
    }
    public void push(T item){
        Node noewNode = new Node(item);
        noewNode.next = top;
        top = noewNode;
    }

    public boolean isEmpty(){
        return top == null;
    }
    public T peek(){
        return top.data;
    }
    public T pop(){
        T data = top.data;
        top = top.next;
        return data;
    }
}