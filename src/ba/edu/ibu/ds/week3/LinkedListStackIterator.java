package ba.edu.ibu.ds.week3;

import java.util.Iterator;

public class LinkedListStackIterator<Item> implements Iterator<Item>{

	private Node<Item> current;
	
	public LinkedListStackIterator(Node<Item> current) {
		this.current = current;
	}
	
	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public Item next() {
		Item item = current.getValue();
		current = current.getNext();
		return item;
	}

}
