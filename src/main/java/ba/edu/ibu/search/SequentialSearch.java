package ba.edu.ibu.search;

/**
 * Sequential (linear) search algorithm.
 * @author Aldin Kovačević
 * @author Amar Mujagić
 *
 */
public class SequentialSearch {

	public static int search(int[] elements, int key) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
