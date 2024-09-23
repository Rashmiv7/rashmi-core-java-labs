package com.deloitte.lab3.ex8;
import java.util.Scanner;

public class Lab3Ex8 {
	
	    public static boolean isPositiveString(String str) {
	        
	        str = str.toUpperCase();	        
	        for (int i = 0; i < str.length() - 1; i++) {
	            
	            if (str.charAt(i) > str.charAt(i + 1)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        
	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter the string");
	        String str =sc.next();
	       
	       System.out.println(isPositiveString(str));
	       sc.close();
	    }
	}



