package com.ibm.core.java.lab3.ex9;

import java.util.Scanner;

public class PositiveString {

    public static boolean isPositiveString(String str) {
        str = str.toUpperCase();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPositiveString(str)) {
            System.out.println("Positive String");
        } else {
            System.out.println("Not a Positive String");
        }

        sc.close();
    }
}