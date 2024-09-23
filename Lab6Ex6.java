package com.deloitte.lab6.ex6;
import java.util.*;

public class Lab6Ex6 {
	   
	    public static List<Integer> votersList(Map<Integer, Integer> idAgeMap) {
	        List<Integer> eligibleVoters = new ArrayList<>();
	        
	        
	        for (Map.Entry<Integer, Integer> entry : idAgeMap.entrySet()) {
	            Integer id = entry.getKey();
	            Integer age = entry.getValue();
	            
	            
	            if (age > 18) {
	                eligibleVoters.add(id);
	            }
	        }
	        return eligibleVoters;
	    }

	    public static void main(String[] args) {
	        
	        Map<Integer, Integer> idAgeMap = new HashMap<>();
	        Scanner scanner =new Scanner(System.in);
	        System.out.println("Enter the number of people:");
	        int n = scanner.nextInt();

	        
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter the ID:");
	            int id = scanner.nextInt();  

	            System.out.println("Enter the age:");
	            int age = scanner.nextInt();  
	        
	            idAgeMap.put(id, age);
	    }
	        List<Integer> voters = votersList(idAgeMap);
	        System.out.println("Eligible Voter IDs: " + voters);
	        scanner.close();
	    }
	}



