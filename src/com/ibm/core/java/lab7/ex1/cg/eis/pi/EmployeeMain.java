package com.ibm.core.java.lab7.ex1.cg.eis.pi;

import java.util.Scanner;

import com.ibm.core.java.cg.eis.bean.Employee;
import com.ibm.core.java.cg.eis.service.EmployeeServiceImpl;


public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setId(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Designation: ");
        emp.setDesignation(sc.nextLine());

        EmployeeServiceImpl service =
                new EmployeeServiceImpl();

        String scheme =
                service.findInsuranceScheme(emp);

        emp.setInsuranceScheme(scheme);

        service.displayEmployee(emp);

        sc.close();
    }
}
