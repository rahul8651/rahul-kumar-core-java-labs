package com.ibm.core.java.lab1.ex1;

import java.util.Scanner;
//SUM OF NUMBER OF CUBES
public class SumOfCubes {

	static int sumOfCubes(int n) {
		int ans = 0;

		while (n > 0) {
			int a = n % 10;
			n = n / 10;
			ans += Math.pow(a, 3);
		}
		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int val = sc.nextInt();
		System.out.println(sumOfCubes(val));
		sc.close();

	}

}
