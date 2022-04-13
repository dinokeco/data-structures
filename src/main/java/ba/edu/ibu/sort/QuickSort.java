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
	        int i = low;
	        int j = high + 1;
	        while (true) {
	            while (less(elements[++i], elements[low])) {
	                if (i == high) {
	                    break;
	                }
	            }
	            while (less(elements[low], elements[--j])) {
	                if (j == low) {
	                    break;
	                }
	            }
	            if (i >= j) {
	                break;
	            }
	            swap(elements, i, j);
	        }
	        swap(elements, low, j);
	        return j;
	    }
}
