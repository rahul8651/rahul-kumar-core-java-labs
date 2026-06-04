package com.ibm.core.java.lab1.ex7;

import java.util.Scanner;

public class CheckNumber {
	
	static boolean checkNumber(int n) {
		String s=Integer.toString(n);
		for(int i=1;i<s.length()-1;i++) {
			if(s.charAt(i)>s.charAt(i+1)) {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(checkNumber(num));
		sc.close();
		
	}

}
