package com.deloitte.lab1.ex1;
import java.util.Scanner;

public class Lab1Ex1 {
	
		Scanner sc = new Scanner(System.in);
		
		 void calSumCubeDigi()
		{
			System.out.println("Enter a number to find the sum of cubes of its digits");
			int num = sc.nextInt();
			int n= num;
			int sum=0;
			while (num!=0) {
				
				int digi = num%10;
				sum = sum+(digi*digi*digi);
				num=num/10;
			}	
			System.out.println("The sum of cube of "+ n +" is "+sum);
			sc.close();
		}

	public static void main(String[] args) {
		
		Lab1Ex1 obj =new Lab1Ex1();
		obj.calSumCubeDigi();
	}
}
