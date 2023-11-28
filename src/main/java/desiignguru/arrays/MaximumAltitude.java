package main.java.desiignguru.arrays;

public class MaximumAltitude {
    public static void main(String[] args) {
        MaximumAltitude maximumAltitude = new MaximumAltitude();
        System.out.println(maximumAltitude.calculateMaxAltitude(new int[]{-5, 1, 5, 0, -7})); // Expected: 1

    }
    public int calculateMaxAltitude(int[] num){
        int maxAltitude = 0;
        int currentAltitude = 0;
        for(int a: num){
            currentAltitude += a;
            maxAltitude = Math.max(currentAltitude,maxAltitude);
        }
        return maxAltitude;
    }
}
