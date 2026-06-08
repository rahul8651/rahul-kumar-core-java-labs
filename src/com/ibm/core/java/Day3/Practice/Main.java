package com.ibm.core.java.Day3.Practice;

public class Main {
	
	public static void main(String[] args) {
		FuncInterface add=(a,b)->a+b;
		//FuncInterface sub=(a,b)->a-b;
		System.out.println(add.addSum(2, 3));
		System.out.println();
	}

}
