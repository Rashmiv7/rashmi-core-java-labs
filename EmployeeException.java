package com.cg.eis.exception;


import java.util.Scanner;



public class EmployeeException {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee's salary");
      
        try
        {
        	double salary = sc.nextInt();
        	validateSalary(salary);
        	sc.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        } 
       
	}
        
        static void validateSalary(double salary)
        {
        	if(salary>3000.0)
        		System.out.println("Valid Salary : "+salary);	
        	else
        		System.out.println("InValid Salary : "+salary);	
        }
	}

