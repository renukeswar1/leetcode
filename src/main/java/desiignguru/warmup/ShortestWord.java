package main.java.desiignguru.warmup;

public class ShortestWord {
    public static void main(String[] args) {
        String[] words1 = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
        String word11 = "fox";
        String word21 = "dog";
        System.out.println(shortestWord(words1,word11,word21));
    }
    public static int shortestWord(String[] words,String word1, String word2){
        int pos1 = -1, pos2 = -1;
        int shortestDistance = words.length;
        for(int i=0;i<words.length;i++){
            if(words[i] == word1){
                pos1 = i;
            }else if(words[i] == word2){
                pos2 = i;
            }
        }
        if(pos1 != -1 && pos2 != -1){
            shortestDistance = Math.min(shortestDistance,Math.abs(pos2-pos1));
        }
        return shortestDistance;
    }
}
