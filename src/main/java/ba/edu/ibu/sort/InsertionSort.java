package ba.edu.ibu.sort;

/**
 * Selection sort class.
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class InsertionSort extends AbstractSort {
	
	/* Insertion sort algorithm */
	public static void sort(int[] elements) {
	    for (int i = 0; i < elements.length; i++) {
	        for (int j = i; j > 0; j--) {
	            if (less(elements[j], elements[j - 1])) {
	                swap(elements, j, j - 1);
	            } else {
	                break;
	            }
	        }
	    }
	}
	
}
