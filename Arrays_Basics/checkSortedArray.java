//WAP to check if array is sorted

public class checkSortedArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,10};
		boolean check= true;
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				check= false;
				break;
			}
		}
		
		if(check!=false)
			System.out.println("Sorted");
		
		else
			System.out.println("Not sorted");

	}

}
