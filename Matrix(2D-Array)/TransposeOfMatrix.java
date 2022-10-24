//WAP to transpose the given matrix. 

/*
 * 
 * Brute force approach: Use a temp array and filled it with transposed value.
 * Dis Adv: Space complexity will increase to O(n^2), due to additional array.
 * 
 * optimised: Swapping (In place Swap)
 * 
 */


public class TransposeOfMatrix {
	
	public static void transpose(int arr[][]) {
		int n = arr.length;
		int temp;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
				
			}
		}
	}
	
	
	public static void main(String args[]) {
		int [] [] arr = {
				{1,2,3},
				{5,6,7},
				{8,9,10}
		};
		transpose(arr);  //calling function
		
		//printing transposed matrix
		System.out.println("Transposed Matrix is: ");
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}


//Time Complexity: O(n^2)
//Space Complexity: O(1)
