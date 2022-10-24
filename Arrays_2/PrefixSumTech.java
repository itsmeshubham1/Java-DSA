//WAP to check if there are any sub-array with 0 sum.


import java.util.HashSet;
import java.util.Set;

public class PrefixSumTech {
	
	public static boolean subArraywithZero(int arr[]) {
		int n= arr.length;
		int sum=0;
		
		Set <Integer> var = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			sum +=arr[i];
			
			if(var.contains(sum))     //check if similar element is present in sum in O(1) complexity.
				return true;		 // If use use any other for loop here then our time complexity increase to O(n^2).
			
			var.add(sum);
		}
		return false;		
	}
	
	public static void main(String[] args) {
		
		int[] arr= {2,3,1,-4,3,-2};
		System.out.println(subArraywithZero(arr));
	}

}

//Time complexity: O(n).
