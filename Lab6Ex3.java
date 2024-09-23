package com.deloitte.lab6.ex3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex3 {
	
	    public static Map<Integer, Integer> getSquares(int[] numbers) {
	        Map<Integer, Integer> squaresMap = new HashMap<>();

	        // Iterate through the array to calculate squares
	        for (int number : numbers) {
	            squaresMap.put(number, number * number); // Add number and its square to the map
	        }

	        return squaresMap;
	    }

	    public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        
	        System.out.println("Enter the number of numbers required");
	        int n=sc.nextInt();
	        int[] num=new int[n];
			
	        System.out.println("Enter "+n+" numbers");
	        	for(int i=0;i<n;i++)
	        	{
	        		num[i]=sc.nextInt();
	        	}
	        Map<Integer, Integer> result = getSquares(num);

	       
	        System.out.println("Number and their squares: " + result);
	        sc.close();
	    }
	}



