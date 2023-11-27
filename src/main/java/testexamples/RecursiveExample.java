package main.java.testexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("renu", "eswar", "chinta","res");
        List<String> res = recursive(strings,1);
        res.stream().forEach(item -> System.out.println(item+" /"));
    }

    private static List<String> recursive(List<String> strings, int index) {
        List<String> newList = new ArrayList<>();
        if (index < strings.size()) {
            newList = recursive(strings, ++index);
        }
        newList.add(newList.get(index - 1));
        return newList;
    }
}
