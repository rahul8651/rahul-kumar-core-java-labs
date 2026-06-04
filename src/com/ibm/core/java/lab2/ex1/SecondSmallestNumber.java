package com.ibm.core.java.lab2.ex1;
import java.util.*;

public class SecondSmallestNumber {
	
	
	public static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 9, 1 };

		int secondSmallest = getSecondSmallest(arr);
		System.out.println("Second Smallest Element: " + secondSmallest);
	}

}
