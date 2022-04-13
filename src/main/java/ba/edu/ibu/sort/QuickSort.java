package ba.edu.ibu.sort;

/**
 * Quick sort implementation with 2-way partitioning.
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class QuickSort extends AbstractSort {

	public static void sort(int[] elements) {
		// your code
	}
	
	private static void sort(int[] elements, int low, int high) {
		// your code
	}
	
	private static void shuffle(int[] elements) {
		// your code
    }
	
	 private static int partition(int[] elements, int low, int high) {
	        int i = low;                                            // 1
	        int j = high + 1;                                       // 1
	        while (true) {                                          // 2
	            while (less(elements[++i], elements[low])) {        // 3
	                if (i == high) {                                // 3
	                    break;                                      // 3
	                }
	            }
	            while (less(elements[low], elements[--j])) {        // 4
	                if (j == low) {                                 // 4
	                    break;                                      // 4
	                }
	            }
	            if (i >= j) {                                       // 5
	                break;                                          // 5
	            }
	            swap(elements, i, j);                               // 6
	        }
	        swap(elements, low, j);                                 // 7
	        return j;                                               // 7
	    }
}
