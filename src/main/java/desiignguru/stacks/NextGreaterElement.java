package main.java.desiignguru.stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {13, 7, 6, 12,7,18,21,40};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        System.out.println(Arrays.toString(nextGreaterElement.printNGE(arr)));
    }

    public int[] printNGE(int arr[]) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int res[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!s.empty() && s.peek() <= arr[i]) {
                s.pop();
            }

            res[i] = s.empty() ? -1 : s.peek();
            s.push(arr[i]);
        }

        return res;
    }
}
