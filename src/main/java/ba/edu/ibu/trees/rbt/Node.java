package ba.edu.ibu.trees.rbt;

/**
 * Red-black tree node implementation.
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class Node<Key extends Comparable<Key>, Value> {
	
	public Key key;							// the node's key
	public Value value;						// the value associated with the key
	public Node<Key, Value> left, right;	// references to the left and right child
	public int size = 1;					// size of the node
	public boolean color;					// the node's color
	
	/* Node constructor */
	public Node(Key key, Value value, boolean color) {
		this.key = key;
		this.value = value;
		this.color = color;
	}
}