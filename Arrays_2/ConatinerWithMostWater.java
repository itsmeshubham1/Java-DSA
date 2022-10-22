/*
 * Container with most water:  (Max amount of water it can hold & width can be ignored).
 * 
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints 
 * of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.(Width of sheets can be ignored)
 * 
 */

public class ConatinerWithMostWater {

	//Applying two pointer approach
	public static void calculateMaxArea(int arr[]) {
		int maxArea =0, area=0;
		int left =0;
		int right = arr.length-1;

		while(left < right) {
			int height = Math.min(arr[left], arr[right]);  //since water can be hold till min height
			int dis = right - left;

			area = dis * height;				//It will hold water in rect format.
			maxArea = Math.max(area, maxArea);    //we need to calculate max amount of water

			if(arr[left] < arr[right]) left++;
			else right--;

		}	

		System.out.println("Max amount of water it can hold is: "+ maxArea);

	}

	public static void main(String[] args) {
		int arr[] = {1,8,6,2,5,4,8,3,7};
		calculateMaxArea(arr);

	}

}

//Time complexity: O(n)
