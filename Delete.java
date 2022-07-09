package Arrays;

public class Delete {
// There is  an issue .......resolve it 
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
	    int x =5;
	    int n = arr.length;
	    for(int i =0;i<arr.length;i++) {
	    	if(arr[i]==x) {
	    		break;
	    	}
	    	if(i==n) {
	    		System.out.println("Baby number is not present ");
	    		break;
	    	}
	    	for(int j=i;i<arr.length;j++) {
	    		arr[j]=arr[i+1];
	    		System.out.print(arr[j]);
	    		break;
	    	}
	    }
		
	}

}
