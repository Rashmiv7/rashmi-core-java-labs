package com.deloitte.lab2.ex4;

import java.util.*;

public class Lab2Ex4 {
	
	Scanner sc =new Scanner(System.in);
	
	int[] getValue()
	{
		System.out.println("Enter the number of elements required in the array");
		int n= sc.nextInt();
		System.out.println("Enter "+n+" numbers");
		int[] a=new int[n];
		
		for(int i=0;i< n;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	
	    
	    public static int[] modifyArray(int[] arr) {
	        
	        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
	        
	        
	        for (int num : arr) {
	            set.add(num);
	        }
	        
	       
	        int[] result = new int[set.size()];
	        int i = 0;
	        for (int num : set) {
	            result[i++] = num;
	        }
	        
	        return result;
	    }

	    public static void main(String[] args) {
	        
	        Lab2Ex4 obj =new Lab2Ex4();
	        int arr[]= obj.getValue();
	        int[] result = modifyArray(arr);
	        
	        System.out.println(Arrays.toString(result));  
	    }
	}


