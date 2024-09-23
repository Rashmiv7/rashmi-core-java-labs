package com.deloitte.lab2.ex1;
import java.util.Scanner;
import java.util.Arrays;  
public class Lab2Ex1 {
	
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
	
	int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println("Sorted array is as follows");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int small = arr[1];
		return small;
	}
	
	public static void main(String[] args) {
		
	Lab2Ex1 obj=new Lab2Ex1();
	int arr[]= obj.getValue();
	int small= obj.getSecondSmallest(arr);
	System.out.println("The second smallest element in the above array is "+small);
	}
}
