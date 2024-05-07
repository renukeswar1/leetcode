package main.java.desiignguru.warmup;

import java.util.HashSet;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {
        System.out.println(checkIfPanagram("TheQuickownFoxJumpsOverTheLazyDog"));
    }

    public static boolean checkIfPanagram(String s){
        Set<Character> seen = new HashSet<>();
        for(Character c : s.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                seen.add(c);
            }
        }
        return seen.size() == 26;
    }
}
