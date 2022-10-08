package com.practiceProblem.java;
import java.util.Scanner;

//WAP to find factorial of a given number
public class FactorialUsingRecursion {
	
	public static int factorial(int num) {
		if(num==0 || num==1)
			return 1;
		else
			return num*factorial(num-1);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		if(num<0)
			System.out.println("Please enter positive number.");
		else
			System.out.println("Factorial of "+num+" is: "+ factorial(num));
	}

}
