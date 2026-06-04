package com.ibm.core.java.lab2.ex2;

import java.util.Arrays;

public class SortString {

	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);

		int mid;
		
		if (arr.length % 2 == 0) {
			mid = arr.length / 2;
		} else {
			mid = (arr.length / 2) + 1;
		}

		for (int i = 0; i < mid; i++) {
			arr[i] = arr[i].toUpperCase();
		}

		for (int i = mid; i < arr.length; i++) {
			arr[i] = arr[i].toLowerCase();
		}

		return arr;
	}

	public static void main(String[] args) {
		String[] arr = { "Banana", "Apple", "Orange", "Mango", "Grapes" };

		String[] result = sortStrings(arr);

		System.out.println("Resulting Array:");
		for (String str : result) {
			System.out.print(str + " ");
		}
	}

}
