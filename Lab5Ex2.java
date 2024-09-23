package com.deloitte.lab5.ex2;
import java.util.Scanner;

public class Lab5Ex2 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first name: ");
	        String firstName = scanner.nextLine();

	        System.out.print("Enter last name: ");
	        String lastName = scanner.nextLine();

	        try {
	            NameValidator.validateName(firstName, lastName);
	            System.out.println("Full name is valid: " + firstName + " " + lastName);
	        } catch (InvalidNameException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
}

	   



