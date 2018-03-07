package ba.edu.ibu.ds.week2;

public class DinoListV2 {

	private Node first;
	
	private int length = 0; 
	
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
		length++;
	}
	
	private Node locate(int index) {
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
				return current;
			}
			counter++;
			current = current.getNext();
		}
		throw new IndexOutOfBoundsException("Index is to high");
	}
	
	public String get(int index) {
		Node n = locate(index);
		return n.getValue();
	}
	
	public void remove(int index) {
		if (first == null) {
			throw new IndexOutOfBoundsException("List is empty");
		}
		if (index == 0) {
			first = first.getNext();
			length--;
		}else {
			Node current = locate(index-1);
			current.setNext(current.getNext().getNext());
			length--;
		}
	}
	
	public void set(int index, String value) {
		Node n = locate(index);
		n.setValue(value);
	}
	
	public int count() {
		return length;
	}
}
