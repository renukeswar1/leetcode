package main.java.udemydatastrcutures;

public class Trie {

    private TrieNode root;
    public Trie(){
        this.root = new TrieNode();
    }
    public void insert(String word){
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(current.children[index] == null){
                TrieNode node = new TrieNode();
                current.children[index] = node;
                current = node;
            }else{
                current = current.children[index];
             }
        }
    }

    public boolean search(String word){
        return  false;
    }
    class TrieNode{
        TrieNode[] children;
        boolean isWord;
        public TrieNode(){
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }
}
