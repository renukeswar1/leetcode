package main.java.desiignguru.queues;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinayNumbers {
    public static void main(String[] args) {
        String[] binaryNums = generateBinaryNumbers(5);
        for (String binaryNum : binaryNums) {
            System.out.println(binaryNum);
        }
    }
    public static String[] generateBinaryNumbers(int n){
        Queue<String> q = new LinkedList<String>();
        q.add("1");

        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = q.poll();
            q.add(res[i] + "0");
            q.add(res[i] + "1");
        }

        return res;
    }
}
