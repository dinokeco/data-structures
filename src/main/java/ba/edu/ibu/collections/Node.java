package ba.edu.ibu.collections;

/**
 * Building block class for IBU collections
 * @author Dino Keco
 *
 */
public class Node {
	
	private int value;
	
	private Node next;
	
	public Node(int value, Node next) {
		super();
		this.value = value;
		this.next = next;
	}

	public Node(int value) {
		super();
		this.value = value;
	}

	public Node() {
		super();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}
	
}
