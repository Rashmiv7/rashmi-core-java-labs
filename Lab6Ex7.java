package com.deloitte.lab6.ex7;
import java.util.*;

public class Lab6Ex7 {
	
	    
	    public static int[] getSorted(int[] numbers) {
	        List<Integer> reversedNumbers = new ArrayList<>();
	        
	        
	        for (int number : numbers) {
	            
	            String reversedStr = new StringBuilder(String.valueOf(number)).reverse().toString();
	            int reversedNumber = Integer.parseInt(reversedStr);
	            
	            reversedNumbers.add(reversedNumber);
	        }
	        
	       
	        Collections.sort(reversedNumbers);
	        
	        int[] sortedArray = new int[reversedNumbers.size()];
	        for (int i = 0; i < reversedNumbers.size(); i++) {
	            sortedArray[i] = reversedNumbers.get(i);
	        }
	        
	        return sortedArray;
	    }

	    public static void main(String[] args) {
	        
	    	Scanner sc =new Scanner(System.in);
	        
	        System.out.println("Enter the number of numbers required");
	        int n=sc.nextInt();
	        int[] arr=new int[n];
			
	        System.out.println("Enter "+n+" numbers");
	        	for(int i=0;i<n;i++)
	        	{
	        		arr[i]=sc.nextInt();
	        	}
	        
	        int[] sortedArray = getSorted(arr);
	        System.out.println("Reversed and Sorted Array: " + Arrays.toString(sortedArray));
	        sc.close();
	    }
	}



