//WAP to separate 0 on left side & 1 on right side in random order
public class ZerosOnesRandomOrder {

	public static void main(String[] args) {
		int[]arr= {1,0,0,1,1,0,1,0,1,0,0,0};
		int [] arr1= new int[arr.length];   //Additional array so space complexity will increase {Brute force approach can be furhter optimized}
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) count++;
		}
		
		//separating new array
		for(int i=0; i<count;i++) {
			arr1[i]=0;
		}
		
    //appending 1 on the right side
		for(int i= count; i<arr1.length; i++) {
			arr1[i]=1;
		}
		
		//Printing new array
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
