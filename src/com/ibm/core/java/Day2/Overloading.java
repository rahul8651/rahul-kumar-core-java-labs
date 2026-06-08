package com.ibm.core.java.Day2;

public class Overloading {

	public static int sum(int a, int b) {
		return a + b;

	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;

	}

	public static double sum(double a, double b, double c) {
		return a + b + c;

	}

	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1.2, 2.2, 3.3));

	}

}
