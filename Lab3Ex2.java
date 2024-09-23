package com.deloitte.lab3.ex2;

import java.util.Scanner;

public class Lab3Ex2 {
	
		

	    
	    public static String getImage(String str) {
	        
	        StringBuffer sb = new StringBuffer(str);
	        
	        
	        String reversedStr = sb.reverse().toString();
	        
	       
	        return str + "|" + reversedStr;
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter a string");
	        String str = sc.next();
	        
	        String result = getImage(str);
	        
	        System.out.println(result); 
	        sc.close();
	    }
	}



