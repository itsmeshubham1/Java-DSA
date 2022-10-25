/* 
 * IMP Question:-----
 * Given an array find max j-i such that arr[j] > arr[i].
 */

public class MaxJminusI {
	
	public static void maxValue(int arr[]) {
		int n = arr.length;
		int [] rightMax = new int[n];    //8,8,8,8,8,8,6,4,4
		int[] leftMin = new int[n];		//5,4,1,1,1,1,1,1,1
		
		//filling right max array
		rightMax[n-1] = arr[n-1];
		for(int i= n-2; i>=0; i--)
			rightMax[i] = Math.max(rightMax[i+1], arr[i]);
		
		//filling left min array
		leftMin[0] = arr[0];
		for(int i=1; i<n; i++)
			leftMin[i] = Math.min(leftMin[i-1], arr[i]);
		
		int i=0, j=0, ans=0;
		
		while(i<n && j<n) {
			if(leftMin[i] < rightMax[j]) {
				ans = Math.max(ans, j-i);
				j++;
			}
			else
				i++;
		}
		
		System.out.println("Max value is: "+ ans);
	}

	public static void main(String[] args) {
		int [] arr= {5,4,1,7,3,8,6,3,4};
		maxValue(arr);

	}

}

//Time complexity: O(n)
//Space complexity: O(n)


/*
 * Brute force approach:
 * 
 * for(int i=9; i<nl i++){
 * 	for(int j=i+1; j<n; j++){
 * 		if(a[j] > a[i])
 * 			ans = Math.max(ans, j-i);
 * }
 * }
 * 
 * Time complexity: O(n^2)
 */
