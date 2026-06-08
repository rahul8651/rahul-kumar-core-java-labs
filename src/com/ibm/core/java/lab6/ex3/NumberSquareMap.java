package com.ibm.core.java.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class NumberSquareMap {

    public static HashMap<Integer, Integer> getSquares(int[] numbers) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : numbers) {
            map.put(num, num * num);
        }

        return map;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 6};

        HashMap<Integer, Integer> result = getSquares(numbers);

        System.out.println("Number -> Square");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
