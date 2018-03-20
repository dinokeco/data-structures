package ba.edu.ibu.ds.week3;

public class Node<Item> {
	
	private Item value;
	
	private Node<Item> next;

	public Node() {
		super();
	}

	public Node(Item value) {
		super();
		this.value = value;
	}

	public Node(Item value, Node<Item> next) {
		super();
		this.value = value;
		this.next = next;
	}

	public Item getValue() {
		return value;
	}

	public void setValue(Item value) {
		this.value = value;
	}

	public Node<Item> getNext() {
		return next;
	}

	public void setNext(Node<Item> next) {
		this.next = next;
	}
	
	
	
}
