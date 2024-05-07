package main.java.desiignguru.slidingwindowpatterns;

public class SmallestSubArrayWithGreaterSum {
    public static void main(String[] args) {
        System.out.println(findMaxSumWithSmallSubArray(8, new int[] { 3, 4, 1, 1, 6 }));
    }
    public static int findMaxSumWithSmallSubArray(int k,int[] arr){
        int windowStart =0, minLength = Integer.MAX_VALUE;
        double windowSum = 0;
        for(int windowEnd =0;windowEnd < arr.length;windowEnd++){
            windowSum += arr[windowStart];
            while(windowSum >= k){
                minLength = Math.min(minLength,windowEnd -windowStart +1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minLength;
    }
}
