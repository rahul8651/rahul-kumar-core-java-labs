package com.ibm.core.java.lab1.ex6;

import java.util.Scanner;

public class SquareDifference {

	static int calculateDifference(int n) {

		int sumOfSquares = 0;
		int sumOfNumbers = 0;

		for (int i = 1; i <= n; i++) {
			sumOfSquares += i * i;
			sumOfNumbers += i;
		}

		int squareOfSum = sumOfNumbers * sumOfNumbers;

		return squareOfSum - sumOfSquares;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Integer Value: ");
		int n = sc.nextInt();

		int result = calculateDifference(n);

		System.out.println("Difference = " + result);

		sc.close();
	}
}