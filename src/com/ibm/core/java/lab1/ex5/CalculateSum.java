package com.ibm.core.java.lab1.ex5;

import java.util.Scanner;

public class CalculateSum {

	static int calculateSum(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		calculateSum(n);
		sc.close();
	}

}
