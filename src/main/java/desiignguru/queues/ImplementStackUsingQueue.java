package main.java.desiignguru.queues;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> aux = new LinkedList<>();
    Queue<Integer> main = new LinkedList<>();
    public static void main(String[] args) {
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
    }
    public void push(int x){
       aux.add(x);
       while(!main.isEmpty()){
           aux.add(main.remove());
       }
       Queue<Integer> temp = main;
       main = aux;
       aux = temp;
    }

    public Integer pop(){
        return main.remove();
    }
}
