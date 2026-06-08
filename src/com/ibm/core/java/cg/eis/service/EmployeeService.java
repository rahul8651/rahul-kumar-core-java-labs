package com.ibm.core.java.cg.eis.service;

import com.ibm.core.java.cg.eis.bean.Employee;

public interface EmployeeService {

    String findInsuranceScheme(Employee emp);

    void displayEmployee(Employee emp);
}