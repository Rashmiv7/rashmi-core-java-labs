package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class Lab3Ex4 {


	    public static int modifyNumber(int number1) {
	        
	        String numStr = String.valueOf(number1);
	        StringBuffer modifiedNum = new StringBuffer();
	        
	        
	        for (int i = 0; i < numStr.length() - 1; i++) {
	            
	            int currentDigit = Character.getNumericValue(numStr.charAt(i));
	            int nextDigit = Character.getNumericValue(numStr.charAt(i + 1));
	            
	           
	            int diff = Math.abs(currentDigit - nextDigit);
	            
	            modifiedNum.append(diff);
	        }
	        
	        
	        modifiedNum.append(numStr.charAt(numStr.length() - 1));
	        
	        
	        return Integer.parseInt(modifiedNum.toString());
	    }

	    public static void main(String[] args) {
	        
	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter a number");
	        int input =sc.nextInt();
	        int result = modifyNumber(input);
	        
	        System.out.println(result);
	        sc.close();
	    }
	}

