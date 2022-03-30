package ba.edu.ibu.sort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
//		insertionSortDemo();
		compareAlgorithms();
	}
	
	private static void compareAlgorithms() {
		int[] elements1 = new int[100000];
	    Random random = new Random();
	        
	    /* Generate random elements */
	    for (int i = 0; i < elements1.length; i++) {
	        elements1[i] = random.nextInt(1000);
	    }
	    
	    /* Create "clones" of the original array, for same sorting conditions */
	    int[] elements2 = elements1.clone();
	    int[] elements3 = elements1.clone();
	    int[] elements4 = elements1.clone();
	    
	    /* Bubble sort */
	    long start = System.currentTimeMillis();
	    BubbleSort.sort(elements1);
	    System.out.println("bubble sort:\t" + (System.currentTimeMillis() - start) + " ms");
	    
	    /* Selection sort */
	    start = System.currentTimeMillis();
	    SelectionSort.sort(elements2);
	    System.out.println("selection sort:\t" + (System.currentTimeMillis() - start) + " ms");
	    
	    /* Insertion sort */
	    start = System.currentTimeMillis();
	    InsertionSort.sort(elements3);
	    System.out.println("insertion sort:\t" + (System.currentTimeMillis() - start) + " ms");
	    
	    /* Shell sort */
	    start = System.currentTimeMillis();
	    ShellSort.sort(elements4);
	    System.out.println("Shell sort:\t" + (System.currentTimeMillis() - start) + " ms");
	}
	
	private static void insertionSortDemo() {
	    int[] elements = new int[100];
	    Random random = new Random();
	        
	    /* Generate random elements */
	    for (int i = 0; i < elements.length; i++) {
	        elements[i] = random.nextInt(1000);
	    }
	        
	    /* Sort the array */
	    InsertionSort.sort(elements);
	        
	    /* Print the elements */
	    for (int i: elements) {
	        System.out.println(i);
	    }
	}
	
}
