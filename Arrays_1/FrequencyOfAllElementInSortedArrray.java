/*
 * Find the frequency of each element in a sorted array.
 */

public class FrequencyOfAllElementInSortedArrray {

	public static void countElements(int arr[]) {
		int count = 1;
		int n = arr.length;

		for(int i=1; i<n;i++) {
			if(arr[i-1] == arr[i]) count++;
			else {
				System.out.println("Frequency of "+arr[i-1]+" is: "+ count);
				count = 1;
			}

			//Handling for last element
			if(i==arr.length-1)
				System.out.println("Frequency of "+arr[n-1]+" is: "+ count);
		}
	}

	public static void main(String[] args) {
		int [] arr= {1,1,2,3,3,4,4,5,5,5,-1};
		countElements(arr);

	}
}

//Time complexity: O(n).
//Space complexity: O(1).
