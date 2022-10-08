//WAP to print Fibonacci series using array.

import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please provide the limit: ");
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		//restricting first & second element
		arr[0]=0;
		arr[1]=1;
		
		System.out.print(arr[0]+" "+arr[1]+" ");
    
		for(int i=2; i<n; i++) {
			arr[i]= arr[i-1]+arr[i-2];
			System.out.print(arr[i]+ " ");
		}

	}
