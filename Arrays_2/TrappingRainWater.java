/*
 * Trapping RainWater Problem:   (Total amount of water it can hold & width should be taken.
 * 
 * Given n non-negative integers representing an elevation map where 
 * the width of each bar is 1, 
 * compute how much water it can trap after raining.
 * 
 */

public class TrappingRainWater {
	
	//using pre-calculation method
	public static void calculateTotalWater(int arr[],int n) {
		int res=0;
		int [] left = new int[n];
		int [] right = new int[n];
		
		//filling left array
		left[0] = arr[0];
		for(int i=1; i<n; i++) {
			left[i]= Math.max(left[i-1], arr[i]);     //left = [0,1,1,2,2,2,2,3,3,3,3,3]
		}
		
		//filling right side array
		right[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);    //right = [3,3,3,3,3,3,3,3,3,2,2,2,1]
		}
		
		//calculating total amount of water
		for(int i=0; i<n; i++) {
			res += Math.min(left[i], right[i]) - arr[i];     //subtracting the base area arr[i]
		}
		
		System.out.println("Total amount of water it can hold is: "+ res);
		
	}

	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		int n = arr.length;
		calculateTotalWater(arr,n);
	}

}

//Time complexity: O(n)
//Space complexity: O(n)   since we are using two additional arrays. 
//By using two pointer space complexity can be reduced to O(1).
