package com.ibm.core.java.lab5.ex1;

import java.util.Scanner;

public class AgeValidator {

    public static void validateAge(int age) throws AgeException {
        if (age <= 15) {
            throw new AgeException("Age must be above 15.");
        }
        System.out.println("Valid age.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}