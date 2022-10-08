//WAP to check whether it's a leap year or not.

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
//		A year is a leap year if the following conditions are satisfied: 
//
//			1. The year is multiple of 400.
//			2. The year is multiple of 4 and not multiple of 100.
		
		System.out.println("Enter the year: ");
		Scanner sc= new Scanner(System.in);
		int year= sc.nextInt();
		
		if ((year%400==0) || ((year % 4 ==0)&& (year % 100 !=0)))
			System.out.println("It's a leap year");
		else
			System.out.println("Not a leap year");
			

	}

}
