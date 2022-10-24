//WAP to rotate matrix 90 degree clock-Wise without using extra space.


public class RotateMatrixClockWise {

	//method to transpose the matrix
	private static void tranaposeMatrix(int arr[][],int n) {

		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

	
	//method to rotate the matrix 90 degree clock-wise
	private static void rotateMatirx(int arr[][], int n) {
		
		//Reversing row or interchanging column
		for(int i=0; i<n; i++) {
			for(int j=0; j<n/2; j++) {       //If half part is swapped then remaining is already swapped.
				int temp = arr[i][j];
				arr[i][j] = arr[i][n-j-1];
				arr[i][n-j-1] = temp;
			}
		}
	}

	
	//method to print the matrix
	private static void printMatrix(int arr[][], int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


	//Driver code
	public static void main(String args[]) {
		int [] [] arr = {
				{1,2,3},
				{5,6,7},
				{8,9,0}
		};

		int n = arr.length;
		
		System.out.println("Original Matrix is: ");
		printMatrix(arr, n);
		
		tranaposeMatrix(arr, n);
		rotateMatirx(arr, n);
		
		System.out.println("After rotating 90 degree clockwise. Resultant matrix is: ");
		printMatrix(arr, n);
	}

}


//Time complexity: O(n^2).
//Space complexity: O(1).
