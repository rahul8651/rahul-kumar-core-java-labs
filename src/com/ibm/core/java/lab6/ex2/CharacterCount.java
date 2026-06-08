package com.ibm.core.java.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static HashMap<Character, Integer> countChars(char[] arr) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'a', 'c', 'b', 'a'};

        HashMap<Character, Integer> result = countChars(chars);

        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
