package com.ibm.core.java.Day4.MultiThreading;

public class Main {
	public static void main(String[] args) {
		MultiThreadingDemo m1=new MultiThreadingDemo();
		m1.start();
		MultiThreadingDemo m2=new MultiThreadingDemo();
		m2.start();
		MultiThreadingDemo m3=new MultiThreadingDemo();
		m3.start();
	}
}
