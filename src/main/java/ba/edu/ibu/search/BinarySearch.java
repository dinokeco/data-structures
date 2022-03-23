package ba.edu.ibu.search;

public class BinarySearch {
	
	/* Binary search algorithm for integer arrays */
	public static int search(int[] elements, int key) {
	    int low = 0; 
	    int high = elements.length - 1;
	    
	    while (low <= high) {
	        int mid = low + (high - low) / 2;
	        if (key < elements[mid]) {
	            high = mid - 1;
	        } else if (key > elements[mid]) {
	            low = mid + 1;
	        } else {
	            return mid;
	        }
	    }
	    return -1;
	}
}
