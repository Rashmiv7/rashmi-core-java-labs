package com.deloitte.lab1.ex5;
import java.util.Scanner;

public class Lab1Ex5 {

	Scanner sc =new Scanner(System.in);
	
	int getNum() {
		System.out.println("Enter a number");
		int num = sc.nextInt();
        return num;
	}
	
	int calculateSum(int n) {
		int sum=0;
		for (int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
	return sum;
	}
	
	public static void main(String[] args)
	{
		Lab1Ex5 obj =new Lab1Ex5();
		int n=obj.getNum();
		System.out.println("Sum of first "+ n +" natural numbers which are divisible by 3 or 5 is "+ (obj.calculateSum(n)));	
	}
}
