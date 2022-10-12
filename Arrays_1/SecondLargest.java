public class SecondLargest {
	
	//function to return 2nd max Index
	public static int SecondLargestIndex(int arr[]) {
		
		//array is of length 1 then 2nd largest isn't make sense
		if (arr.length<2) return -1;
		
		//taking variables
		int max= 0;
		int secMax = -1;
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>arr[max]) {
				secMax = max;
				max=i;
			}
			else if(arr[i]<arr[max]) {
				if(arr[i]>arr[secMax] || secMax==-1)
				secMax=i;
			}
		}
		
		return secMax;
	}

	public static void main(String[] args) {
		int [] arr= {10,21,38,25,50};
		int index = SecondLargestIndex(arr);
		
		if(index == -1)
			System.out.println("Second largest value isn't possible");
		
		else
			System.out.println("Second largest element is: "+ arr[index]);
		
	}

}

//Time complexity: θ(n) , since we need to traverse each element isnide the array so θ{} is more specific than O{}.
