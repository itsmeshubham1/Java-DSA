package com.Arrays.java;

//WAP to find numbers greater than the average of no. of given array.


public class GreatestAmongAverage {

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		float avg;
		int sum=0;
    
		//calculating the sum
		for(int ele : num) {
			sum +=ele;
		}
		System.out.println("Total sum of elements inside array is: "+ sum);
		
		//calculating average
		avg= sum/num.length;
		System.out.println("Average is: "+ avg);
		
		//print numbers which are greater than average
		System.out.println("Numbers greater than average are: ");
		for(int i=0; i<num.length;i++) {
			if(num[i]> avg)
				System.out.println(num[i]);
		}
	}

}
