package main.java.desiignguru.warmup;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A mani, a plan, a canal, Painama!"));
    }
    public static boolean isValidPalindrome(String str){
        char[] c = str.toCharArray();
        int start = 0, end = str.length()-1;
        while (start < end){
            while(start < end && !Character.isAlphabetic(c[start])){
                start++;
            }
            while(start < end && !Character.isAlphabetic(c[end])){
                end--;
            }
            if(Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))){
                return  false;
            }
            start++;
            end--;
        }
        return true;
    }
}
