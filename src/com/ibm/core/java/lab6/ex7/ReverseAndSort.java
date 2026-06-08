package com.ibm.core.java.lab6.ex7;

import java.util.Arrays;

public class ReverseAndSort {

    public static int[] getSorted(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int reverse = 0;

            while (num > 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }

            result[i] = reverse;
        }

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 63, 89};

        int[] sortedArray = getSorted(arr);

        System.out.println("Sorted Array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
