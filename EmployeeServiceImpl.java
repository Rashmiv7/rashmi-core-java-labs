package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void getEmployeeDetails(Employee employee) {
        
    }

    @Override
    public String findInsuranceScheme(Employee employee) {
        double salary = employee.getSalary();
        String designation = employee.getDesignation();

        if (salary < 30000) {
            return "No Scheme";
        } else if (salary < 60000) {
            return "Scheme B";
        } else {
            return "Scheme A";
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Insurance Scheme: " + employee.getInsuranceScheme());
    }
}
