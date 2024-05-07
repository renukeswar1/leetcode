package main.java.desiignguru.warmup;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));

    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> freqMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            freqMap.put(s.charAt(i),freqMap.getOrDefault(s.charAt(i),0)+1);
            freqMap.put(t.charAt(i),freqMap.getOrDefault(t.charAt(i),0)-1);
        }
        for(Character c: freqMap.keySet()){
            if(freqMap.get(c) != 0){
                return false;
            }
        }

        // If all characters have a frequency of 0, this means that 't' is an anagram of 's'.
        return true;
    }
}
