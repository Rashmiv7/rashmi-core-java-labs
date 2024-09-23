package com.deloitte.lab1.ex6;
import java.util.Scanner;

public class Lab1Ex6 {
	Scanner sc =new Scanner(System.in);
	
	int getNum() {
		System.out.println("Enter a number");
		int num = sc.nextInt();
        return num;
	}
	
	int calculateDifference(int n)
	{
		int sum1=0;
		for(int i=1;i<=n;i++)
		{
			sum1=sum1+(i*i);
		}
		int sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum2=sum2+i;
		}
		int Diff= sum1-(sum2*sum2);
		return Diff;	
	}
	
	public static void main(String[] args)
	{
		Lab1Ex6 obj = new Lab1Ex6();
		int n = obj.getNum();
		System.out.println("Difference between the sum of the squares and the square of the sum of the first "+ n +" natural numbers is "+(obj.calculateDifference(n)));	
	}
	

}
