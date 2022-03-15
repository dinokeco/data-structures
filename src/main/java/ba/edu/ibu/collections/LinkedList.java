package ba.edu.ibu.collections;

import java.util.Iterator;

/**
 * Linked list collection IBU implementation
 * @author Dino Keco
 *
 */
public class LinkedList<T> implements Iterable<T> {

	private Node<T> start;
	
	public void add(T element) {
		if (this.start == null) { // list is empty
			this.start = new Node<T>(element);
		}else {
			// find place for new node
			Node<T> current = start;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new Node<T>(element));
		}
	}
	
	public int count() {
		Node<T> current = start;
		int count = 0;
		
		while(current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}
	
	@Override
	public String toString() {
		return start.toString();
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator<T>{
		
		private Node<T> current = start;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T val = current.getValue();
			current = current.getNext();
			return val;
		}
		
		
	}
}
