package com.deloitte.lab5.ex1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab5Ex1 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	       

	        try {
	        	 int age = scanner.nextInt();
	            AgeValidator.validateAge(age);
	        } catch (InvalidAgeException e) {
	            System.out.println("Invalid age: " + e.getMessage());
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter a number.");
	        } finally {
	            scanner.close();
	        }
	    }
}

	
		