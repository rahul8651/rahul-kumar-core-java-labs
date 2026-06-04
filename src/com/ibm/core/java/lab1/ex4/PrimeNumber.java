package com.ibm.core.java.lab1.ex4;

import java.util.Scanner;

public class PrimeNumber {

    static boolean primeNumber(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (primeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");
        printPrime(n);

        sc.close();
    }
}