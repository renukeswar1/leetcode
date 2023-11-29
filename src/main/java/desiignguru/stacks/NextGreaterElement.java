package main.java.desiignguru.stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {13, 7, 6, 12,7,18,21,40};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        System.out.println(Arrays.toString(nextGreaterElement.printNGE(arr)));
    }

    public int[] printNGE(int inputArray[]) {
        int n = inputArray.length;
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= inputArray[i]) {
                stack.pop();
            }

            res[i] = stack.empty() ? -1 : stack.peek();
            stack.push(inputArray[i]);
        }

        return res;
    }
}
