package main.java.desiignguru.slidingwindowpatterns;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        System.out.println(maximumSubArray(new int[] { 2, 1, 5, 1, 3, 2 },2));
    }
    public static int maximumSubArray(int[] arr, int K){
        int windowStart = 0, windowSum = 0;
        int max = 0;
        for(int windowEnd =0;windowEnd<arr.length;windowEnd++){
            windowSum += arr[windowEnd];
            if(windowEnd >= K -1){
                max = Math.max(windowSum,max);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return max;
    }
}
