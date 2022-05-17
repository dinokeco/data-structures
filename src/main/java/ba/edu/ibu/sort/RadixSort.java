package ba.edu.ibu.sort;

/**
 * Radix sort (utilizing counting sort).
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class RadixSort extends AbstractSort {
	
    /* Radix sort algorithm (public invocation) */
    public static void sort(int[] elements) {
        int max = getMax(elements);
        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            sort(elements, exp);
        }
    }
 
    /* Digit-wise radix sort logic */
    private static void sort(int[] elements, int exp) {
    	int[] aux = new int[elements.length];
        int[] frequency = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < elements.length; i++) {
            int digit = (elements[i] / exp) % 10;
            frequency[digit]++;
        }
        
        for (int i = 1; i < 10; i++) {
            frequency[i] += frequency[i - 1];
        }

        for (int i = elements.length - 1; i >= 0; i--) {
            int digit = (elements[i] / exp) % 10; // 1
            aux[frequency[digit] - 1] = elements[i];
            frequency[digit]--;
        }
        
        for (int i= 0; i < elements.length; i++) {
            elements[i] = aux[i];
        }
    }
    
    /* Find the maximum element in the array */
    private static int getMax(int[] elements) {
        int max = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }
}
