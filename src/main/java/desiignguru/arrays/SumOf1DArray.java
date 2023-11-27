package main.java.desiignguru.arrays;

import java.util.Arrays;

public class SumOf1DArray {
    public static void main(String[] args) {
        SumOf1DArray sumOf1DArray = new SumOf1DArray();
        int[][] testInputs = {
                {1,2,3,4},
                {3,1,4,2,2},
                {-1,-2,-3,-4,-5}
        };
        for(int[] a : testInputs){
            int[] output = sumOf1DArray.runningSum(a);
            for(int ele: output){
                System.out.println(ele + " ");
            }
            System.out.println();
        }

    }

    public int[] runningSum(int[] input){
        if(input == null || input.length == 0){
            return new int[0];
        }
        // output array
        int[] result = new int[input.length];
        result[0] = input[0]; // insert first element in output array as first element in input array
        // Loop through the array starting from index 1, adding the previous sum to the current element
        for(int i = 1;i<input.length;i++){
            result[i] = result[i-1] + input[i];
        }
        return result;
    }
}
