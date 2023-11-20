package main.java.udemydatastrcutures.hashset;

import java.io.Serializable;
import java.util.*;

public class HashTable {
    private int size = 7;
    Node[] dataMap;
    HashTable(int size){
        dataMap = new Node[size];
    }
    class Node {
        String key;
        int value;
        Node next;
        Node(String key,int value){
            this.key = key;
            this.value = value;
        }
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i=0;i< keyChars.length;i++){
            int anscii = keyChars[i];
            hash = (hash + anscii*23 ) % dataMap.length;
        }
        return hash;
    }
    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null){
            dataMap[index] = newNode;
        }else{
            Node temp = dataMap[index];
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public boolean findCommonElements(int[] arr1, int[] arr2){
        Map<Integer,Boolean> myMap = new HashMap<>();

        for(int i=0;i<arr1.length;i++){
            myMap.put(i,true);
        }
        for(int i=0;i<arr2.length;i++){
            if(myMap.get(i) != null) return true; // false
        }
        return false;
    }

    public List<Integer> findDuplicates(int[] nums){
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer,Integer> numCounts = new HashMap<>();
        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entrySet : numCounts.entrySet()){
            if(entrySet.getValue() > 1){
                duplicates.add(entrySet.getKey());
            }
        }
        return duplicates;
    }

    public Character findFirstNonRepeatingCharacter(String s){
        char[] chars = s.toCharArray();
        Map<Character,Integer> numCounts = new HashMap<>();
        for (char num : chars) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }
        for(int i=0;i<chars.length;i++){
            char c = s.charAt(i);
            if(numCounts.get(c) ==1){
                return c;
            }
        }
        return null;
    }

    public static List<List<String>> groupAnangram(String[] strs){
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] st = s.toCharArray();
            Arrays.sort(st);
            String string = String.valueOf(st);
            if(map.get(string) != null){
                List<String> a = map.get(string);
                a.add(s);
                map.put(string,a);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(string,list);
            }
        }
        for(Map.Entry<String,List<String>> entry : map.entrySet() ){
            res.add(entry.getValue());
        }
        return res;
    }

    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> anagrams = groupAnangram(str);
        System.out.println(anagrams);
    }
}
