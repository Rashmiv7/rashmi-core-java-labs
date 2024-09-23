package com.deloitte.lab6.ex2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex2 {
	
	    public static Map<Character, Integer> countChars(char[] arr) {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        for (char c : arr) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        return charCountMap;
	    }

	    public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine(); 
	        
	       
	        char[] charArray = input.toCharArray();
	        Map<Character, Integer> result = countChars(charArray);

	        
	        System.out.println("Character counts: " + result);
	        sc.close();
	    }
	}



