package ba.edu.ibu.search;

public class Main {

	public static void main(String[] args) {
//		sequentialSearchDemo();
		binarySearchDemo();
	}

	
	public static void sequentialSearchDemo() {
		int[] elements = {49, 16, 19, 17, 15, 53, 30, 90, 42, 11};
		
		// Successful search
		int key = 53;
		int index = SequentialSearch.search(elements, key);
		System.out.println("Element " + key + " is located at index: " + index);
		
		// Element not found
		key = 18;
		index = SequentialSearch.search(elements, key);
		System.out.println("Element " + key + " is located at index: " + index);
	}
	
	public static void binarySearchDemo() {
	    /* Sorted array */
	    int[] elements = { 3, 4, 5, 11, 14, 19, 21, 26, 33, 49, 56, 71, 72, 74, 89, 90, 98, 100 };
	        
	    /* Return the index of an element */
	    int index = BinarySearch.search(elements, 19);
	    System.out.println("index: " + index);
	    
	    /* Element not found */
	    int index2 = BinarySearch.search(elements, 42);
	    System.out.println("index: " + index2);
	}
}
