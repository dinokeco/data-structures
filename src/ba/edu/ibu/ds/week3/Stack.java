package ba.edu.ibu.ds.week3;

public interface Stack<Item> extends Iterable<Item> {

	public void push(Item item);
	
	public Item pop();
	
	public int count();
	
	public boolean isEmpty();
}
