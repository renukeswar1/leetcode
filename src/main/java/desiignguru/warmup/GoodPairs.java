package main.java.desiignguru.warmup;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numOfGoodPairs(nums1));
    }
    public static int numOfGoodPairs(int[] nums){
        int pairCount =0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
            pairCount += map.get(n)-1;
        }
        return  pairCount;
    }
}
