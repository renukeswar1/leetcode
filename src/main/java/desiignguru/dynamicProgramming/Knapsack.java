package main.java.desiignguru.dynamicProgramming;

public class Knapsack {

    public static void main(String[] args) {
        String items[] = { "Apple", "Orange", "Banana", "Melon" };
        int[] weights = { 2, 3, 1, 4 };
        int[] profits= { 4, 5, 3, 7 };
        System.out.println(solveKnapsack(profits,weights,5));

    }
    public static int solveKnapsack(int[] profits, int[] weights, int capacity) {
        return knapsackRecursive(profits, weights, capacity, 0);
    }

    private static int knapsackRecursive(int[] profits, int[] weights, int capacity, int index) {
        if (capacity <= 0 || index >= profits.length)
            return 0;

        int profit1 = 0;
        if(weights[index] <= capacity){
            profit1 = profits[index] + knapsackRecursive(profits,weights,
                    capacity - weights[index], index +1);
        }
      //  int profit2 = knapsackRecursive(profits, weights, capacity, index + 1);
       // return Math.max(profit2,profit1);
        return profit1;
    }
}
