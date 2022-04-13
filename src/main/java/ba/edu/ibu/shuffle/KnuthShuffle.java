package ba.edu.ibu.shuffle;

import java.util.Random;

/**
 * Knuth shuffle algorithm.
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class KnuthShuffle {
	
	/* Knuth shuffle */
    public static void shuffle(int[] elements) {
        Random rand = new Random();
        for (int i = 0; i < elements.length; i++) {
            int r = i + rand.nextInt(elements.length - i);

            int tmp = elements[r];
            elements[r] = elements[i];
            elements[i] = tmp;
        }
    }
    
}
