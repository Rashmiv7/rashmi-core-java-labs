package com.deloitte.lab6.ex5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab6Ex5 {

	    public static int getSecondSmallest(int[] arr) {
	        
	        List<Integer> arrayList = new ArrayList<>();
	        for (int num : arr) {
	            arrayList.add(num);
	        }

	        
	        Collections.sort(arrayList);
	        
	        return arrayList.get(1); 
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
	        int secondSmallest = getSecondSmallest(arr);

	        System.out.println("The second smallest element is: " + secondSmallest);
	        sc.close();
	    }
	}


