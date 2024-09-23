package com.deloitte.lab9.ex5;
import java.util.function.IntUnaryOperator;
import java.util.Scanner;

public class Lab9Ex5 {
	
	    
	    public static int calculateFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        int factorial = 1;
	        for (int i = 2; i <= n; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }

	    public static void main(String[] args) {
	       
	        IntUnaryOperator factorialFunction = Lab9Ex5::calculateFactorial;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a number");
	       
	        int number = sc.nextInt();
	        int result = factorialFunction.applyAsInt(number);

	       
	        System.out.println("Factorial of " + number + " is: " + result);
	        sc.close();
	    }
	}



