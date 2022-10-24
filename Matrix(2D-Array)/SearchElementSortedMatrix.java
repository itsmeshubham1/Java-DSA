/*
 * WAP to check if element is present inside the sorted array. (IMP Interview Question)
 * 
 * Brute force approach: 
 * 			Traverse whole element. Time complexity: O(n*m)
 * 
 * Optimized:
 * 			Using sorted array features. 
 * 			We will start checking from last element of first row. 
 * 			Time complexity: O(n+m)
 */


public class SearchElementSortedMatrix {
	
	static boolean  searchElement(int arr[][], int key) {
		int i=0;			//row
		int j=arr.length; //column
		
		while(i<arr.length && j>=0) {
			
			if(arr[i][j] == key) 
				return true;
			
			else if(key > arr[i][j])     
				i++;	//incrementing row
			
			else
				j--;   	//incrementing column
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[][] arr = {
				{1,4,5,7},
				{2,5,6,9},
				{6,10,11,13}
		};
		
		int key = 5;
		boolean res= searchElement(arr, key);
		System.out.println(res);
	}

}

//Time complexity: O(n+m)
//Space complexity: O(1)
