//WAP to print the max possible sum in sub-array and print sub array too.

/*

 Follow the below steps to implement the idea:

1. Initialize the variables s, start, and end with 0 and maxSum = INT_MIN and currSum = 0
2. Run a for loop form 0 to N-1 and for each index i: 
3. Add the arr[i] to currSum.
4. If maxSum is greater than currSum then update maxSum to currSum and update start to s and end to i .
5. If currSum < 0 then update currSum = 0 and s with i+1.

Print values from index start to end.

*/

public class MaxSumSubArray_Print_Subarray {
	
	public static void KadensAlgoPrintSubarray(int arr[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int start=0,end=0,s=0;
		
		for(int i=0;i<arr.length;i++) {
			currSum +=arr[i];
			
			if(currSum > maxSum) {
				maxSum = currSum;
				start =s;
				end =i;
			}
			
			if(currSum < 0) { 
				currSum = 0;
				s = i+1;
			}
		}
		
		System.out.println("The max possible sum in subarray is: "+ maxSum);
		System.out.println("Subarray start index is: "+ start);
		System.out.println("Subarray end index is: "+ end);
		
		//printing sub array
		System.out.println("Sub array is: ");
		for(int i=start; i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
  //Driver Code
	public static void main(String[] args) {
		int[]arr= {6,-7,4,-2,1,5,-4};
		KadensAlgoPrintSubarray(arr);
	}

}

//Time complexity: O(n)
//Space complexity: O(1)
