package ba.edu.ibu.collections;

/**
 * Linked list collection IBU implementation
 * @author Dino Keco
 *
 */
public class LinkedList {

	private Node start;
	
	public void add(int element) {
		if (this.start == null) { // list is empty
			this.start = new Node(element);
		}else {
			// find place for new node
			Node current = start;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new Node(element));
		}
	}
	
	public int count() {
		Node current = start;
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
}
