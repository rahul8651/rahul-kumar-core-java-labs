package com.ibm.core.java.lab3.ex5;

import java.util.Scanner;

public class TextStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text (type END on a new line to finish):");

        StringBuilder text = new StringBuilder();
        int lines = 0;

        while (true) {
            String line = sc.nextLine();

            if (line.equals("END")) {
                break;
            }

            text.append(line).append("\n");
            lines++;
        }

        String content = text.toString();

        // Count characters (excluding the final extra newline)
        int characters = content.length();

        // Count words
        String trimmed = content.trim();
        int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;

        System.out.println("\nStatistics:");
        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);

        sc.close();
    }
}
