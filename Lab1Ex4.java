package com.deloitte.lab1.ex4;
import java.util.Scanner;

public class Lab1Ex4 {
	
	Scanner sc = new Scanner(System.in);
	void displayPrime()
	{
		System.out.println("Enter an integer upto where the prime numbers are required ");
		int range = sc.nextInt();
		
		for (int i=2;i<=range;i++)
		{
			int flag =1;
			for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
			}
            if (flag == 1)
                    System.out.print(i + " ");   		
		}
	}
		
	public static void main(String[] args) {
		
		Lab1Ex4 obj = new Lab1Ex4();
		obj.displayPrime();
	}
}
