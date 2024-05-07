package main.java.desiignguru.warmup;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(17));
    }
    public static int squareRoot(int num){
        int left = 2,right= num/2;
        int pivot =0;
        while(left <= right){
            pivot = left + (right- left)/2;
            long a = pivot * pivot;
            if(a > num){
                right = pivot -1;
            }else if(a< num){
                left = pivot +1;
            }else
                return pivot;
        }
        return right;
    }
}
