package com.ibm.core.java.lab7.ex1.cg.eis.service;

import com.ibm.core.java.cg.eis.bean.Employee;

public interface EmployeeService {

    String findInsuranceScheme(Employee emp);

    void displayEmployee(Employee emp);
}