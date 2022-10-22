//In the array of 0 & 1 find the longest length of consecutive 1's.

public class CountMaxnumOf1 {

	public static void maxCountof1(int arr[]) {
		int count =0;
		int max =0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == 1) count++;
			
			else count=0;
			
			if(count>max) max=count;
		}
		
		System.out.println("Max occurence of 1 is: "+ max);
	}
	
	public static void main(String[] args) {
		int [] arr= {1,1,1,0,0,1,0,1,1,0,1,1,1,1,1};
		maxCountof1(arr);
	
	}

}

//Time complexity: O(n)
//Space complexity: O(1)
