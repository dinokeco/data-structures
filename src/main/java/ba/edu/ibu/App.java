package ba.edu.ibu;

import ba.edu.ibu.collections.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addToRear(5);
		ll.addToRear(6);
		ll.addToRear(7);
		
		for(int a : ll ) {
			System.out.println(a);
		}
		
		System.out.println("Hello World!");
		System.out.println(ll);
		
		System.out.println("lenght of list is "+ ll.count());
	}
}
