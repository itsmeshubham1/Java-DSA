//WAP to calculate the sum of elements inside array.

public class SumOfArrayElements {

	public static void main(String[] args) {
		int[]arr = {10,20,30,50};  //declaring & storing values inside the array
		int sum=0;
		
		//logic
		for(int i=0; i<arr.length;i++) {
			sum +=arr[i];
		}
		
		System.out.println("Total sum of elements inside the array is: "+ sum);

	}

}
