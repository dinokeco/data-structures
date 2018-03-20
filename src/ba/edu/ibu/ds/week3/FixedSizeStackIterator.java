package ba.edu.ibu.ds.week3;

import java.util.Iterator;

public class FixedSizeStackIterator<Item> implements Iterator<Item>{

	private Item[] stack;
	private int count;
	
	public FixedSizeStackIterator(Item[] stack, int count) {
		this.count = count;
		this.stack = stack;
	}
	
	@Override
	public boolean hasNext() {
		return count != 0;
	}

	@Override
	public Item next() {
		return stack[--count];
	}

}
