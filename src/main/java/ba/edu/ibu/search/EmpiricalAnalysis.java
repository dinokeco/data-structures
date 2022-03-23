package ba.edu.ibu.search;

import java.util.Random;

public class EmpiricalAnalysis {
	
	public static void main(String[] args) {
		// Change the algorithm ("sequential" or "binary") and the number of elements
		runAndMeasureAlgorithm("sequential", 1000);
	}
	
	public static void runAndMeasureAlgorithm(String algorithm, int arraySize) {
		int[] elements = generateArray(arraySize);
		int key = new Random().nextInt(arraySize * 10); // key to be found
		
		long start = System.currentTimeMillis(); // start measuring time
		int index;
		switch (algorithm) {
			case "sequential":
				index = SequentialSearch.search(elements, key);
				break;
			case "binary":
				index = BinarySearch.search(elements, key);
				break;
			default:
				System.out.println("Invalid algorithm selected. Use 'sequential' or 'binary'.");
				return;
		}
		
		System.out.println("Element " + key + " was found at index: " + index);
		long timeElapsed = System.currentTimeMillis() - start;
		System.out.println("Elapsed time for " + algorithm + " search on " + arraySize + " elements: " + timeElapsed + " ms");
	}
	
	/**
	 * Generate an array of random integers with a given size.
	 * @param size
	 */
	public static int[] generateArray(int size) {
		int[] elements = new int[size];
		
		for (int i = 0; i < elements.length; i++) {
			elements[i] = new Random().nextInt(size * 10);
		}
		
		return elements;
	}
}
