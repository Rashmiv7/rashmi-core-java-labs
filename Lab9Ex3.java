package com.deloitte.lab9.ex3;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class Lab9Ex3 {
	
	    public static void main(String[] args) {
	        
	        String validUsername = "admin";
	        String validPassword = "password123";

	       
	        BiPredicate<String, String> authenticate = (username, password) -> 
	            username.equals(validUsername) && password.equals(validPassword);

	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter username");
	        String inputUsername = sc.next();
	        System.out.println("Enter password");
	        String inputPassword = sc.next();

	        boolean isAuthenticated = authenticate.test(inputUsername, inputPassword);

	        System.out.println(isAuthenticated);
	        sc.close();
	    }
	}

