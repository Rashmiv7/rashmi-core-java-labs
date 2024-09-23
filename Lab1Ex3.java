package com.deloitte.lab1.ex3;
import java.util.Scanner;


public class Lab1Ex3 {
	
	int a=1,b=1,c=0;
	
	Scanner sc=new Scanner(System.in);
	
	void seriesNonRecursive() {
		
	System.out.println("Non Recursive Method");	
	System.out.println("Enter the position in the Fibonacci sequence");
		int limit=sc.nextInt();
	
	for(int i=1;i<=(limit-2);i++)
	{
		c=a+b;
		a=b;
		b=c;	
	}
	
	System.out.println("Value in the "+limit+"th position is "+c);
	System.out.println("");
	}
	
	int seriesRecursive(int num)
	{
		
		if(num<=1)
		
			return num;
		
		return seriesRecursive(num-1)+seriesRecursive(num-2);
	}
	
	int getValue()
	{
		System.out.println("Recursive Method");	
		System.out.println("Enter the position in the Fibonacci sequence");
		int limit=sc.nextInt();
		return limit;
	}

	public static void main(String[] args) {
		
		Lab1Ex3 obj = new Lab1Ex3();
		
		obj.seriesNonRecursive();
	    
		int limit= obj.getValue();
	
			System.out.println("Value in the "+limit+"th position is "+obj.seriesRecursive(limit));
		
	}
}
