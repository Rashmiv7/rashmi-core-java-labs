package com.deloitte.lab9.ex2;
import java.util.function.Function;
import java.util.*;

public class Lab9Ex2 {
	
	    public static void main(String[] args) {
	        
	        Function<String, String> addSpaces = (str) -> String.join(" ", str.split(""));

	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter a string");
	        String input = sc.next();
	        
	        String formattedString = addSpaces.apply(input);

	        System.out.println("Formatted String: " + formattedString);
	        sc.close();
	    }
	}



