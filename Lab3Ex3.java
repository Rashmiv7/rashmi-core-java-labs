package com.deloitte.lab3.ex3;
import java.util.Scanner;

public class Lab3Ex3 {
	 
		    public static String alterString(String str) {
		       
		        char[] chararr = str.toCharArray();
		        
		       
		        for (int i = 0; i < chararr.length; i++) {
		           
		            if (isConsonant(chararr[i])) {
		                
		                chararr[i] = (char) (chararr[i] + 1);
		            }
		        }
		        
		        return new String(chararr);
		    }
    
		    public static boolean isConsonant(char ch) {
		        
		        ch = Character.toLowerCase(ch);
		       
		        return (ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
		    }

		    public static void main(String[] args) {
		    	
		    	
		    	System.out.println("Enter a string");
		    	Scanner sc =new Scanner(System.in);
		    	
		        String input = sc.next();
		        String result = alterString(input);
		        
		        System.out.println(result);  
		        sc.close();
		    }
}
