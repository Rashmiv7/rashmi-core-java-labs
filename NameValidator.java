package com.deloitte.lab5.ex2;

public class NameValidator {

	 public static void validateName(String firstName, String lastName) throws InvalidNameException {
	        if (firstName.trim().isEmpty() && lastName.trim().isEmpty()) {
	            throw new InvalidNameException("Both first name and last name cannot be blank.");
	        }
	    }
	 }
