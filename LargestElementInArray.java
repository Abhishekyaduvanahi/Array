package Arrays;

public class LargestElementInArray {
	// the commented approach is not working ....uncomment it and resolve issue
//	public static int largelement(int arr[]) {
//		int res=0;
//		for(int i=1;i<arr.length;i++) {
//		
//				if(arr[i]>arr[res]) {
//					res=i;
//				return res;
//				}
//	}
//		return res;
//	}

	
	
	
	//---->  Given below approach is naive approach.... in which firstly i sorted ...
	public static void main(String[] args) {
		int arr[]= {10,5,40,6,20,30};
		int n = arr.length;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
			int	temp = arr[i];
			arr[i+1]=temp;
			
			}
			
		}
		
		System.out.println(arr[n-1]);	

			}
		}

	


