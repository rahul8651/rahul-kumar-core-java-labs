package com.ibm.core.java.lab2.ex4;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ModifyArray {
	
	public static int[] modifyArray(int[] arr) {

        
        Set<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        
        int[] result = new int[set.size()];
        int index = result.length - 1;

        for (Integer num : set) {
            result[index--] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 5, 2, 3, 4, 1, 5};

        int[] result = modifyArray(arr);

        System.out.println("Array after removing duplicates and sorting in descending order:");
        System.out.println(Arrays.toString(result));
    }

}
