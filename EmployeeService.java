package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
    void getEmployeeDetails(Employee employee);
    String findInsuranceScheme(Employee employee);
    void displayEmployeeDetails(Employee employee);
}
