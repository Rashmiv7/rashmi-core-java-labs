package com.deloitte.lab1.ex8;
import java.util.Scanner;


public class Lab1Ex8 {
	
Scanner sc =new Scanner(System.in);
	
	int getValue()
	{
		System.out.println("Enter a number to check it is a power of 2 or not");
		int num = sc.nextInt();
        return num;
	}
	
	boolean checkNumber(int n)
	{
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}
		
	public static void main(String[] args) {
		Lab1Ex8 obj =new Lab1Ex8();
		int n = obj.getValue();
		System.out.println(obj.checkNumber(n));
	}

}
