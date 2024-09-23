package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeServiceImpl();

        
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter Employee Designation: ");
        String designation = scanner.nextLine();

       
        Employee employee = new Employee(id, name, salary, designation);

       
        String insuranceScheme = employeeService.findInsuranceScheme(employee);
        employee.setInsuranceScheme(insuranceScheme);

       
        employeeService.displayEmployeeDetails(employee);

      
        scanner.close();
    }
}
