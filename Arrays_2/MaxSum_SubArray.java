//WAP to print max possible sum in sub array.

public class MaxSum_SubArray {
	
	public static void KadensAlgo(int arr[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			currSum +=arr[i];
			
			if(currSum > maxSum) maxSum = currSum;
			
			if(currSum < 0) currSum = 0;  //if sum is negative then discard it.
		}
		
		System.out.println("The max possible sum in subarray is: "+ maxSum);
	}

  //Driver Code
	public static void main(String[] args) {
		int[]arr= {6,-7,4,-2,1,5,-4};
		KadensAlgo(arr);
	}

}


//Time complexity: O(n)
//Space complexity: O(1)
