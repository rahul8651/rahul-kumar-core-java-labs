package com.ibm.core.java.lab5.ex3;

import java.util.Scanner;
public class EmployeeSalaryValidator {

    public static void validateSalary(double salary)
            throws EmployeeException {

        if (salary < 3000) {
            throw new EmployeeException(
                    "Salary is below 3000. Employee is not eligible.");
        }

        System.out.println("Salary is valid.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        try {
            validateSalary(salary);
        } catch (EmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
