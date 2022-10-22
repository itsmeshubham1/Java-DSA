package com.Arrays.java;

//WAP to move all zeroes to end of array

public class ZeroToEndOfArray {

	public static void shiftZero(int arr[]) {
		int j=0;   //count of non-zero elements
		
		// Traverse the array. If element encountered is non-zero, then replace the element at index 'j'
    // with this element
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=0) {
				arr[j]= arr[i];
				j++;
			}
		}
		
		// Now all non-zero elements have been shifted to  front and 'j' is set as index of first 0.
    // Make all elements 0 from j to end.
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		
		//printing sorted array
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}	
	}
		
	public static void main(String[] args) {
		int [] arr= {8,0,1,3,0,0,5,0};
		shiftZero(arr);
	}

}

//Time complexity: O(n)
//Space complexity: O(1)
