package com.deloitte.lab2.ex2;
import java.util.Scanner;
import java.util.Arrays;
import java.text.Collator;

public class Lab2Ex2 {
	
	Scanner sc =new Scanner(System.in);
	String[] getValue()
	{
		System.out.println("Enter the number of elements required in the array");
		int n= sc.nextInt();
		System.out.println("Enter "+n+" strings");
		String[] str=new String[n];
		
		for(int i=0;i< n;i++)
		{
			str[i]=sc.next();
		}
		return str;
	}
	String[] sortStrings(String[] str)
	{
		int range;
		
		Arrays.sort(str, Collator.getInstance());
		if(str.length%2==0)
			range=(str.length)/2;
		else
			range =((str.length)/2)+1;
		
		String[] sorted=new String[str.length];
		for(int i=0;i<str.length;i++)
		{
			if(i<range)
				sorted[i]=str[i].toUpperCase();
			else
				sorted[i]=str[i].toLowerCase();
		}
		return sorted;
		}
	
	
	public static void main(String[] args) {
		
		Lab2Ex2 obj =new Lab2Ex2();
		String[] str = obj.getValue();
		String[] sorted= obj.sortStrings(str);
		System.out.println("Sorted array is as follows");
		for(int i=0;i<sorted.length;i++)
		{
			System.out.print(sorted[i]+" ");
		}
	}
}
