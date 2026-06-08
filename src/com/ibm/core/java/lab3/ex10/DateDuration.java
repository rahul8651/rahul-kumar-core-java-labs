package com.ibm.core.java.lab3.ex10;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDuration {

    public static void calculateDuration(LocalDate inputDate) {
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(inputDate, currentDate);

        System.out.println("Duration:");
        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-mm-dd): ");
        String dateStr = sc.nextLine();

        LocalDate inputDate = LocalDate.parse(dateStr);

        calculateDuration(inputDate);

        sc.close();
    }
}