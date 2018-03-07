package ba.edu.ibu.ds.week2;

public class DinoList {

	private Node first;
	
	public void add(String element) {
		if (first == null) {
			Node node = new Node();
			node.setValue(element);
			first = node;
		} else {
			Node current = first;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			Node node = new Node();
			node.setValue(element);
			current.setNext(node);
		}
	}
	
	public String get(int index) {
		int counter = 0;
		if (index < 0) {
			throw new IndexOutOfBoundsException("Negative incides are not allowed");
		}	
		if (first == null) {
			throw new IndexOutOfBoundsException("List is empty");
		}
		Node current = first;
		while(current != null) {
			if (index == counter) {
				return current.getValue();
			}
			counter++;
			current = current.getNext();
		}
		throw new IndexOutOfBoundsException("Index is to high");
	}
	
	public void remove(int index) {
		int counter = 0;
		if (index < 0) {
			throw new IndexOutOfBoundsException("Negative incides are not allowed");
		}	
		if (first == null) {
			throw new IndexOutOfBoundsException("List is empty");
		}
		if (index == 0) {
			first = first.getNext();
		}else {
			Node current = first;
			while(current.getNext() != null) {
				counter++;
				if (index == counter) {
					//remove
					current.setNext(current.getNext().getNext());
					return;
				}
				
				current = current.getNext();
			}
			throw new IndexOutOfBoundsException("Index is to high");
		}
		
	}
	
	public void set(int index, String value) {
		int counter = 0;
		if (index < 0) {
			throw new IndexOutOfBoundsException("Negative incides are not allowed");
		}	
		if (first == null) {
			throw new IndexOutOfBoundsException("List is empty");
		}
		Node current = first;
		while(current != null) {
			if (index == counter) {
				current.setValue(value);
				return;
			}
			counter++;
			current = current.getNext();
		}
		throw new IndexOutOfBoundsException("Index is to high");
	}
	
	public int count() {
		int counter = 0;
		Node current = first;
		while(current != null) {
			counter++;
			current = current.getNext();
		}
		return counter;
	}
}
