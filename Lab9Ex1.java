package com.deloitte.lab9.ex1;
import java.util.function.BiFunction;
import java.util.Scanner;

public class Lab9Ex1 {

	    public static void main(String[] args) {
	        
	        BiFunction<Double, Double, Double> power = (x, y) -> Math.pow(x, y);

	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the value of x: ");
	        double x =sc.nextDouble();
	        
	        System.out.println("Enter the value of y: ");
	        double y =sc.nextDouble();
	        System.out.println(x + " raised to the power of " + y + " is: " + power.apply(x, y));
	        sc.close();
	    }
	}



