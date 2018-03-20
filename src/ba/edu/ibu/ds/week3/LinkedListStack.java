package ba.edu.ibu.ds.week3;

import java.util.Iterator;

public class LinkedListStack<Item> implements Stack<Item>{
	
	private Node<Item> first;
	
	private int count = 0;
	
	@Override
	public Iterator<Item> iterator() {
		return new LinkedListStackIterator<>(first);
	}

	@Override
	public void push(Item item) {
		first = new Node<Item>(item, first);
		count++;
	}

	@Override
	public Item pop() {
		if(count == 0) 
			throw new RuntimeException("Stack is empty");
		
		Item item = first.getValue();
		first = first.getNext();
		count--;
		return item;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return first==null;
	}

}
