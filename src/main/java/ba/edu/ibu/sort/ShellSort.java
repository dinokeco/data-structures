package ba.edu.ibu.sort;

/**
 * Shell sort class.
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class ShellSort extends AbstractSort {
	
	public static void sort(int[] elements) {
	    int h = 1;                                                      // 1
	    while (h < elements.length / 3) {                               // 1
	        h = 3 * h + 1;                                              // 1
	    }
	        
	    while (h >= 1) {                                                // 2
	        for (int i = h; i < elements.length; i++) {                 // 3
	            for (int j = i; j >= h; j -= h) {                       // 4
	                if (less(elements[j], elements[j - h])) {           // 5
	                    swap(elements, j, j - h);                       // 5
	                } else {
	                    break;                                          // 6
	                }
	            }
	        }
	        h = h / 3;                                                  // 7
	    }	}
	
}
