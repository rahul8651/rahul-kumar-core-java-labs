package com.ibm.core.java.lab3.ex3;

import java.util.Scanner;

public class AlterString {

    static String alterString(String str) {
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' &&
                ch[i] != 'o' && ch[i] != 'u' &&
                ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' &&
                ch[i] != 'O' && ch[i] != 'U') {

                ch[i]++;
            }
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Altered String: " + alterString(str));

        sc.close();
    }
}