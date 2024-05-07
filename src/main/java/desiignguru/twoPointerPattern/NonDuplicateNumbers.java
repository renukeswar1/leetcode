package main.java.desiignguru.twoPointerPattern;

public class NonDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
        System.out.println(removeDuplicatenumbers(arr));
    }
    public static int removeDuplicatenumbers(int[] num){
        int nextNonDuplicate = 0;
        for(int i=1;i<num.length;i++){
            if(num[nextNonDuplicate] != num[i]){
                num[nextNonDuplicate] = num[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }
}
