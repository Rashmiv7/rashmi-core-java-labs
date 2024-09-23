package com.deloitte.lab3.ex5;
import java.util.Scanner;

public class Lab3Ex5 {
	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the text (type 'exit' on a new line to finish):");
	        
	        StringBuilder text = new StringBuilder();
	        String line;
	        int lineCount = 0;
	        
	        
	        while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
	            text.append(line).append("\n");
	            lineCount++;
	        }
	        
	        
	        String content = text.toString().trim();
	        
	        
	        int charCount = content.length();
	        
	        
	        String[] words = content.split("\\s+");
	        int wordCount = words.length;
	        
	        
	        System.out.println("Number of lines: " + lineCount);
	        System.out.println("Number of words: " + wordCount);
	        System.out.println("Number of characters: " + charCount);
	        
	        scanner.close();
	    }
	}



