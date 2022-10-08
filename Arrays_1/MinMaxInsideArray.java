//WAP to find min & max element inside the array

public class MinMaxInsideArray {

	public static void main(String[] args) {
    
		int[] arr= {10,25,35,15,45};
		int min= arr[0];
		int max=arr[0];
		
    //logic
		for(int i=0; i<arr.length; i++) {  
			if(arr[i]<min) {
				min = arr[i];
			}
			
			else if(arr[i]>max) {
				max=arr[i];
			}
		}
		//printing max & min value
		System.out.println("Max value: "+ max);
		System.out.println("Min value: "+ min);
	}

}
