package ba.edu.ibu.trees;

/**
 * Binary search tree implementation.
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    
    private Node<Key, Value> root;
    
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
    
    /* Return the size of the BST (total number of nodes) */
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
    
    /* Add a value to the BST under a given key */
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }
    
    /* Private put() method */
    private Node<Key, Value> put(Node<Key, Value> x, Key key, Value value) {        
        if (x == null) {
            return new Node<Key, Value>(key, value);
        }
        
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else {
            x.value = value;
        }
        
        x.size = 1 + size(x.left) + size(x.right);
        return x;
    }
    
    /* Find the minimum key of the BST */
    public Key findMin() {  
       return findMin(root).key;
    }   
    
    /* Private findMin() method */
    private Node<Key, Value> findMin(Node<Key, Value> x) {
       if (x.left == null) {
           return x;
       }
       return findMin(x.left);
    }
    
    /* Find the maximum key of the BST */
    public Key findMax() {  
        return findMax(root).key;
    }
    
    /* Private findMax() method */
    private Node<Key, Value> findMax(Node<Key, Value> x) {
        if (x.right == null) {
            return x;
        }
        return findMax(x.right);
    }
    
    /* Find the rank of a given key */
    public int rank(Key key) {                      
        return rank(root, key);
    }   
    
    /* Private rank() method */
    private int rank(Node<Key, Value> x, Key key) {
        if (x == null) {
            return 0;
        }
        
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return rank(x.left, key);
        } else if (cmp > 0) {
            return 1 + size(x.left) + rank(x.right, key);
        } else {
            return size(x.left);
        }
    }
    
    /* Delete the node with the minimum key */
    public void deleteMin() {
        root = deleteMin(root);
    }
    
    /* Private deleteMin() method */
    private Node<Key, Value> deleteMin(Node<Key, Value> x) {
        if (x.left == null) {
            return x.right;
        }
        
        x.left = deleteMin(x.left);
        x.size = 1 + size(x.left) + size(x.right);
        
        return x;
    }
    
    /* Delete a node with the given key */
    public void delete(Key key) {
        root = delete(root, key);
    }
    
    /* Private delete() method */
    private Node<Key, Value> delete(Node<Key, Value> x, Key key) {
        if (x == null) {
            return null;
        }
        
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = delete(x.left, key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else {
            if (x.right == null) {
                return x.left;
            }
            if (x.left == null) {
                return x.right;
            }
            
            Node<Key, Value> t = x;
            x = findMin(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.size = 1 + size(x.left) + size(x.right);
        return x;
    }
 
    /* Simple in-order traversal */
    public void inorder() {
        // your code
    }
    
    /* Private inorder() method */
    private void inorder(Node<Key, Value> x) {
        // your code
    }
    
    /**
     * Try to implement the postorder and preorder traversal, too.
     * The logic is the same as above.
     */
}
