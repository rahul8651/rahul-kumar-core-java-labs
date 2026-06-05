package com.ibm.core.java.lab2.ex3;

import java.util.Arrays;

public class SortArray {

	public static int[] getSorted(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = reverseNumber(arr[i]);
		}

		Arrays.sort(arr);
		

		return arr;
	}

	public static int reverseNumber(int num) {
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		return rev;
	}

	public static void main(String[] args) {

		int[] arr = { 12, 45, 82, 10 };

		int[] result = getSorted(arr);

		System.out.println("Sorted Array After Reversing Numbers:");
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

}
