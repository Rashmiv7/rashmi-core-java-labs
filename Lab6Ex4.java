package com.deloitte.lab6.ex4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex4 {

	    public static Map<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks) {
	        Map<Integer, String> medalMap = new HashMap<>();

	       
	        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
	            int regNo = entry.getKey(); 
	            int marks = entry.getValue();

	            // Determine the medal type based on marks
	            if (marks >= 90) {
	                medalMap.put(regNo, "Gold");
	            } else if (marks >= 80) {
	                medalMap.put(regNo, "Silver");
	            } else if (marks >= 70) {
	                medalMap.put(regNo, "Bronze");
	            }
	        }

	        return medalMap; 
	    }

	    public static void main(String[] args) {
	        
	        HashMap<Integer, Integer> studentMarks = new HashMap<>();
	        Scanner scanner =new Scanner(System.in);
	        System.out.println("Enter the number of students:");
	        int n = scanner.nextInt();

	        
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter student registration number:");
	            int regNo = scanner.nextInt();  

	            System.out.println("Enter student marks:");
	            int marks = scanner.nextInt();  
	        
	        studentMarks.put(regNo, marks);
	    }
	        Map<Integer, String> result = getStudents(studentMarks);

	        
	        System.out.println("Students eligible for medals: " + result);
	        scanner.close();
	    }
	}



