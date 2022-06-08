package ba.edu.ibu.trees.rbt;

/**
 * Red-black tree implementation.
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class RedBlackTree<Key extends Comparable<Key>, Value> {
	
	private Node<Key, Value> root;
	private static final boolean RED = true;
	private static final boolean BLACK = false;
	
	/* Retrieve a value associated with a given key */
	public Value get(Key key) {
		Node<Key, Value> x = root;
		
		while (x != null) {
			int cmp = key.compareTo(x.key);
			if (cmp < 0) {
				x = x.left;
			} else if (cmp > 0) {
				x = x.right;
			} else {
				return x.value;
			}
		}
		
		return null;
	}
	
	/* Orient a (temporarily) right-leaning red link to lean left */
	private Node<Key, Value> rotateLeft(Node<Key, Value> h) {
		Node<Key, Value> x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		h.size = 1 + size(h.left) + size(h.right);
		return x;
	}
	
	/* Orient a left-leaning red link to (temporarily) lean right */
	private Node<Key, Value> rotateRight(Node<Key, Value> h) {
		Node<Key, Value> x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		h.size = 1 + size(h.left) + size(h.right);
		return x;
	}
	
	/*  Split a (temporary) 4-node */
	private void flipColors(Node<Key, Value> h) {
		h.color = RED;
		h.right.color = BLACK;
		h.left.color = BLACK;
	}
	
	/* Return whether a given node has a red link */
	private boolean isRed(Node<Key, Value> x) {
		if (x == null) {
			return false;
		}
		return x.color == RED;
	}
	
	/* Add a value to the red-black tree under a given key */
	public void put(Key key, Value value) {
		root = put(root, key, value);
		root.color = BLACK;
	}
	
	/* Private put() method */
	private Node<Key, Value> put(Node<Key, Value> h, Key key, Value value) {
		if (h == null) {
			return new Node<Key, Value>(key, value, RED);
		}
		
		int cmp = key.compareTo(h.key);
		if (cmp < 0) {
			h.left = put(h.left, key, value);
		} else if (cmp > 0) {
			h.right = put(h.right, key, value);
		} else {
			h.value = value;
		}
		
		/* Color balancing */
		if (isRed(h.right) && !isRed(h.left)) {
			h = rotateLeft(h);
		}
		if (isRed(h.left) && isRed(h.left.left)) {
			h = rotateRight(h);
		}
		if (isRed(h.left) && isRed(h.right)) {
			flipColors(h);
		}
		
		h.size = 1 + size(h.left) + size(h.right);
		return h;
	}

    /* Return the size of the tree (total number of nodes) */
    public int size() {
        return size(root);
    }
    
    /* Private size() method */
    private int size(Node<Key, Value> x) {  
        if (x == null) {
            return 0;
        }
        return x.size;
    }
}