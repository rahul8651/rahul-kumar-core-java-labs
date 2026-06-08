package com.ibm.core.java.lab6.ex1;
import java.util.*;

public class HashMapSorter {

    public static List<String> getSortedValues(HashMap<Integer, String> map) {
        List<String> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList);
        return valueList;
    }

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Ravi");
        map.put(102, "Amit");
        map.put(103, "Kiran");
        map.put(104, "Deepa");

        List<String> sortedValues = getSortedValues(map);

        System.out.println("Sorted Values:");
        for (String value : sortedValues) {
            System.out.println(value);
        }
    }
}
