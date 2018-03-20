package ba.edu.ibu.ds.week3;

public class ResizingArrayStack<Item> extends FixedSizeArrayStack<Item>{

	@Override
	public void push(Item item) {
		if (count == stack.length) {
			this.resize(2*count);
		}
		super.push(item);
	}

	@Override
	public Item pop() {
		if (count > 0 && count == stack.length / 4)
			resize(stack.length/2);
		return super.pop();
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count==0;
	}
	
	@SuppressWarnings("unchecked")
	private void resize(int capacity) {
		Item[] copy =  (Item[]) new Object[capacity];
		for(int i = 0; i < count; i++) {
			copy[i] = stack[i];
		}
		stack = copy;
	}

}