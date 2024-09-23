package com.deloitte.lab1.ex7;
import java.util.Scanner;

public class Lab1Ex7 {
	
	Scanner sc =new Scanner(System.in);
	
	int getValue()
	{
		System.out.println("Enter a number to check whether it is increasing or not");
		int num = sc.nextInt();
        return num;
	}
	
	boolean checkNumber(int number)
	{
		int last,beforeLast,flag=0;
		while(number!=0)
		{
			last = number%10;
			number= number/10;
			beforeLast =number%10;
			
			if(last>=beforeLast)
				flag=1;
			else
				return false;
		}
		if (flag == 1)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Lab1Ex7 obj =new Lab1Ex7();
		int number = obj.getValue();
		System.out.println((obj.checkNumber(number)));
	}
}
