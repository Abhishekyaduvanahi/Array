package Arrays;

public class SecondLargestELement {

	public static void main(String[] args) {
		
	int arr[]= {10,5,6,20,30};
	int n = arr.length;
	for(int i =0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
		int	temp = arr[i];
		arr[i+1]=temp;
		
		}
		
	}
	
	System.out.println(arr[n-2]);	

	}

}
