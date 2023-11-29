package main.java.desiignguru.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(checkIfStringIsPalindrome("A man a plan a canal Panama"));
    }
    public static boolean checkIfStringIsPalindrome(String s){
        Deque<Character> queue = new ArrayDeque<>();
        s = s.replaceAll("\\s", "").toLowerCase();
        for(Character c: s.toCharArray()){
            queue.add(c);
        }
        while(queue.size()>1){
            if(!queue.removeFirst().equals(queue.removeLast())){
                return false;
            }
        }
        return true;
    }
}
