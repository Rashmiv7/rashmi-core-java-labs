package com.deloitte.lab2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {
	
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
	  
    public static int[] getSorted(int[] arr) {
        int[] reversedArr = new int[arr.length];
        
       
        for (int i = 0; i < arr.length; i++) {
           
            String reversedString = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            reversedArr[i] = Integer.parseInt(reversedString);
        }
        
        
        Arrays.sort(reversedArr);
        
        return reversedArr;
    }

    public static void main(String[] args) {
    	
    	Lab2Ex3 obj =new Lab2Ex3();
    	int arr[]= obj.getValue();
        
        int[] result = getSorted(arr);
             
        System.out.println(Arrays.toString(result));  
    }
}
