package com.ibm.core.java.lab1.ex3;

import java.util.Scanner;

public class Fibonacci {
	static int fibo(int n) {
		if(n<=2) {
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
	
	// Using for loop
	
	static void fibo1(int n) {
		 if (n == 1 || n == 2) {
		        System.out.println(1);
		        return;
		    }
		
		int a=1;
		int b=1;
		int ans=0;
		for(int i=3;i<=n;i++) {
			ans=a+b;
			a=b;
			b=ans;
			
		}
		System.out.println("The Fibonacci of "+ n + " is :"+ans);
	
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		System.out.println("The Fibonacci of "+ n + " is :"+fibo(n));
		fibo1(n);
		sc.close();
		
		
	}

}
