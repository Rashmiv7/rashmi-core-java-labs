package com.deloitte.lab3.ex1;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Lab3Ex1 {
	    
	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.println("Enter a line of integers separated by spaces:");
	        String input = scanner.nextLine();
	        
	        StringTokenizer st = new StringTokenizer(input);
	        
	        int sum = 0;
	        
	        System.out.println("The integers are:");
	        while (st.hasMoreTokens()) {
	            
	            int num = Integer.parseInt(st.nextToken());
	            
	            System.out.println(num);
	            
	            sum += num;
	        } 
	        System.out.println("Sum of all integers: " + sum);
	        scanner.close();
	    }
	}


