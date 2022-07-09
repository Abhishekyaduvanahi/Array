package Arrays;
//import java.io.*; 
//import java.util.*; 

public class ArrayList {
	

	public static void main(String[] args) {
	

java.util.ArrayList<Integer> list1 = new java.util.ArrayList<Integer>();


// when i was using Arraylist<Integer> list1 = new ArrayList<Integer>(); then error was there check by commenting above ones ...
	// ArrayList<Integer> list1 = new ArrayList<Integer>();
	list1.add(10);
	list1.add(15);
	list1.add(23);
	
	// Here for removing we have to pass the index value .....
	list1.remove(1);
	
	System.out.println(list1);
	
	}

}
