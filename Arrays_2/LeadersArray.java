//WAP to fin leader's in an Array.
//Leaders: ELement which don't have larger element on right side.

public class LeadersArray {
	
	public static void LeadersInArrayOptimized(int arr[]) {
		int largest= Integer.MIN_VALUE;
		
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]>largest) {
				largest= arr[i];            //Updating the largest
				System.out.print(largest+" "); //print Leader's in reverse order
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {2,7,6,4,1,3};		
		LeadersInArrayOptimized(arr);
	}

}

//Native approach:
//Take element from left side, check every other's element inside array.
//In this case we will need to use two for loops.
//Our time complexity: O(n^2).

//Optimized approach:
//In optimized approach we will traverse from rightmost side and check with its next left element.
//Time Complexity: O(n)
//In order to print element in original order in optimized approach
//Take another array : store the leader's value 
//Print it in reverse order
