package main.java.desiignguru.warmup;

public class SwapVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("renukeswar"));
    }

    public static String reverseVowels(String str){
        String vowels = "aeiouAEIUO";

        int start = 0, end = str.length()-1;
        char[] c = str.toCharArray();
        while(start < end){
            while(start < end && vowels.indexOf(c[start]) == -1){
                start++;
            }
            while (start < end && vowels.indexOf(c[end]) == -1){
                end--;
            }
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        return new String(c);
    }
}
