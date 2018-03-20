package ba.edu.ibu.ds.week3;

import java.util.Iterator;

public class FixedSizeArrayStack<Item> implements Stack<Item>{
	
	protected Item[] stack;
	protected int count = 0;
	
	@SuppressWarnings("unchecked")
	public FixedSizeArrayStack(int size) {
		this.stack = (Item[]) new Object[size];
	}
	public FixedSizeArrayStack() {
		this(10); // hack for time being
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new FixedSizeStackIterator<>(stack, count);
	}

	@Override
	public void push(Item item) {
		stack[count++] = item;
	}

	@Override
	public Item pop() {
		if (count == 0) 
			throw new RuntimeException("Stack is empty");
		return stack[--count];
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count==0;
	}

}
