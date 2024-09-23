package com.deloitte.lab5.ex1;

public class AgeValidator {
	
	public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15.");
        }
        System.out.println("Valid age: " + age);
    }

}
