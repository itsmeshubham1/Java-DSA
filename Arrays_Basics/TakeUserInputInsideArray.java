//WAP to take user i/p inside the array and print it.

import java.util.Scanner;

public class TakeUserInputInsideArray {

	public static void main(String[] args) {
		//Declaring the array
		int[] arr = new int[5];
		
		//Taking user i/p inside the array
		System.out.println("Please provide 5 values inside the array: ");
		Scanner obj = new Scanner(System.in);
		for(int i=0; i<arr.length;i++) {
			arr[i] = obj.nextInt();
		}
		obj.close();
		
		//printing values	
		System.out.println("Your entered values are: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
