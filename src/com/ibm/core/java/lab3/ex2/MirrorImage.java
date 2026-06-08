package com.ibm.core.java.lab3.ex2;

import java.util.Scanner;

public class MirrorImage {

	static String mirrorImage(String str) {
		String rev = new StringBuilder(str).reverse().toString();
		return str + "|" + rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(mirrorImage(str));
		sc.close();
		
	}

}
