package com.ibm.core.java.lab3.ex1;

public class StringCheck {
	
	public static void main(String[] args) {
		String str1="Hello";
		String str3=new String("Hello");
		String str2=new String("Hello");
		System.out.println(str1==str2);
		System.out.println(str3==str2);
	}

}
