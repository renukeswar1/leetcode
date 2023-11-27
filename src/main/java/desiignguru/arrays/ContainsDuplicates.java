package main.java.desiignguru.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        ContainsDuplicates solution = new ContainsDuplicates();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicates(nums1));

        int[] nums2 = {1, 2, 3, 4,1};
        System.out.println(solution.containsDuplicates(nums2));
    }
    public boolean containsDuplicates(int[] a){
        Set<Integer> set = new HashSet<>();
        for(int x: a){
            if(!set.add(x)){
                return true;
            }
        }
        return false;
    }
}
