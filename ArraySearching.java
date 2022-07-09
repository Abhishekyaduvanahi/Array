package Arrays;
import java.util.Scanner;
// If you are visiting it then remove break keyword and then check it .....
public class ArraySearching {

	public static void main(String[] args) {
	
		int arr[] = {1,4,6,7,98,0,12,4,566,50};
		System.out.println("Enter the no. which you want to search ");
		Scanner number = new Scanner(System.in);
		int number1 = number.nextInt();
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==number1) {
				System.out.println("The number you are searching is at index:- "+i);
				break;
			}
			else {
				System.out.println("NUmber is not present in the list ");
				break;
			}
		}
	
		
		

	}

}
// Binary Search is an efficient way to search  .....
