package com.deloitte.lab1.ex2;

import java.util.Scanner;
public class Lab1Ex2 {
	
	Scanner sc=new Scanner(System.in);
	
	void trafficLight()
	{
		System.out.println("Enter 1 for red, 2 for yellow and 3 for green light respectively");
		int light=sc.nextInt();
		
		switch(light)
		{
		case 1:
			System.out.println("STOP");
			break;
			
		case 2:
			System.out.println("READY");
			break;
			
		case 3:
			System.out.println("GO");
			break;
			
		default:
			System.out.println("The number entered is incorrect.");
			
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		Lab1Ex2 obj = new Lab1Ex2();
		obj.trafficLight();
	}

}
