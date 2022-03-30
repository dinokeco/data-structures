package ba.edu.ibu.sort;

public abstract class AbstractSort {
	
    /* Returns whether the first element is less than the second one */
    public static boolean less(int v, int w) {
        return v < w;
    }
    
    /* Swaps the two elements in an array */
    public static void swap (int[] elements, int a, int b) {
        int tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }
}
