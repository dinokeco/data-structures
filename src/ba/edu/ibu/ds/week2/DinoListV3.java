package ba.edu.ibu.ds.week2;

import java.util.Iterator;

public class DinoListV3<Item> implements Iterable<Item>{

	private NodeV3<Item> first;
	
	private int length = 0; 
	
	public void add(Item element) {
		if (first == null) {
			NodeV3<Item> node = new NodeV3<Item>();
			node.setValue(element);
			first = node;
		} else {
			NodeV3<Item> current = first;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			NodeV3<Item> node = new NodeV3<Item>();
			node.setValue(element);
			current.setNext(node);
		}
		length++;
	}
	
	private NodeV3<Item> locate(int index) {
		int counter = 0;
		if (index < 0) {
			throw new IndexOutOfBoundsException("Negative incides are not allowed");
		}	
		if (first == null) {
			throw new IndexOutOfBoundsException("List is empty");
		}
		NodeV3<Item> current = first;
		while(current != null) {
			if (index == counter) {
				return current;
			}
			counter++;
			current = current.getNext();
		}
		throw new IndexOutOfBoundsException("Index is to high");
	}
	
	public Item get(int index) {
		NodeV3<Item> n = locate(index);
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
			NodeV3<Item> current = locate(index-1);
			current.setNext(current.getNext().getNext());
			length--;
		}
	}
	
	public void set(int index, Item value) {
		NodeV3<Item> n = locate(index);
		n.setValue(value);
	}
	
	public int count() {
		return length;
	}

	public NodeV3<Item> getFirst() {
		return first;
	}

	public void setFirst(NodeV3<Item> first) {
		this.first = first;
	}

	@Override
	public Iterator<Item> iterator() {
		return new DinoListV3Iterator<Item>(this);
	}
}
