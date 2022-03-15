package ba.edu.ibu;

import ba.edu.ibu.collections.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(5);
		ll.add(6);
		ll.add(7);
		System.out.println("Hello World!");
		System.out.println(ll);
		
		System.out.println("lenght of list is "+ ll.count());
	}
}
