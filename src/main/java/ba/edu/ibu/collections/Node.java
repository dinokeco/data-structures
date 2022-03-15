package ba.edu.ibu.collections;

/**
 * Building block class for IBU collections
 * @author Dino Keco
 *
 */
public class Node<T> {
	
	private T value;
	
	private Node<T> next;
	
	public Node(T value, Node<T> next) {
		super();
		this.value = value;
		this.next = next;
	}

	public Node(T value) {
		super();
		this.value = value;
	}

	public Node() {
		super();
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "[" + value + ", => " + next + "]";
	}
	
}
