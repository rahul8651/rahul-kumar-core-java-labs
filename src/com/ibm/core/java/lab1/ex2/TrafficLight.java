package com.ibm.core.java.lab1.ex2;

import java.util.Scanner;

public class TrafficLight {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the color: ");
		String color = sc.nextLine();

		switch (color) {
		case "Red":
			System.out.println("STOP");
			break;
		case "Green":
			System.out.println("GO");
			break;
		case "Yellow":
			System.out.println("READY");
			break;
		default:
			System.out.println("Invalid Color");
		}
		sc.close();
	}


}
