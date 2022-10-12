//WAP to remove duplicates from sorted array

public class RemoveDuplicatedSorTedArray {

	public static void main(String[] args) {
		int [] arr= {0,2,3,3,4,4,7,8,9,9};
		int j=0;
		
		arr[j]=arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i] != arr[j]) {
				arr[j+1] = arr[i];
				j++;
			}
		}
		
		
		for(int i=0; i<=j; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}

//Space complexity: O(1). Since we are not taking any duplicate array.
//Time complexity: O(n).
