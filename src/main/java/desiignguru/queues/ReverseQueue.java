package main.java.desiignguru.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    static Queue<Integer> queue;
    public static void main(String[] args) {

        queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Call the method to reverse the order of elements in the queue.
        reverseQueue();

        // Print the reversed queue to the console.
        System.out.println(queue);

    }
    public static void reverseQueue(){

        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }

    }

}
