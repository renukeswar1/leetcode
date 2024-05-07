package main.java.desiignguru.twoPointerPattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] result = search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println(result[0]+" "+result[1]);

    }
    public static int[] search(int[] num,int target){
        int left = 0;
        int right = num.length-1;
        while (left < right){
            int currentSum = num[left] + num[right];
            if(currentSum == target){
                return new int[]{left,right};
            }
            if (target > currentSum)
                left++; // we need a pair with a bigger sum
            else
                right--;
        }
        return new int[]{-1,-1};
    }
    public static int[] alternateApproach(int[]  num, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num.length;i++){
            if(map.containsKey(target - num[i])){
                return  new int[]{map.get(target-num[i]),i};
            }else{
                map.put(num[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}

