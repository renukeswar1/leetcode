package main.java.desiignguru.arrays;

public class DifferenceArray {

    public static void main(String[] args) {
        int[] example1 = {2, 5, 1, 6};
        DifferenceArray differenceArray = new DifferenceArray();
        // Output should be: [12, 5, 1, 8]
        printArray(differenceArray.differenceArray(example1));
    }
    // Helper method to print array elements
    public static void printArray(int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public int[] differenceArray(int[] nums){
        int n = nums.length;
        int[] leftSums = new int[n];
        int[] rightSums = new int[n];
        int[] diffArray = new int[n];
        leftSums[0] = nums[0];
        for(int i=1;i<n;i++){
            leftSums[i] = nums[i] + leftSums[i-1];
        }
        rightSums[n-1] = nums[n-1];
        for(int j=n-2;j>=0;j--){
            rightSums[j] = rightSums[j+1]+nums[j];
        }
        for(int i=0;i<n;i++){
            diffArray[i] = Math.abs(leftSums[i]-rightSums[i]);
        }
        return diffArray;
    }
}
