package ba.edu.ibu.collections;


import java.util.Iterator;

/**
 * Doubly linked list implementation.
 * <p>
 * Implement the missing method code.
 * Feel free to delete "return null", etc. lines; they're just placeholders.
 *
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class DoublyLinkedList<Item> implements Iterable<Item> {
    private Node2<Item> head;
    private Node2<Item> tail;
    private int size = 0;

    /* Add a new node to the front of the doubly linked list */
    public void addToFront(Item item) {
        //your code
    }

    /* Remove a node from the front of the doubly linked list */
    public void removeFromFront() {
        //your code
    }

    /* Add a new node to the end of the doubly linked list */
    public void addToRear(Item item) {
        //your code
    }

    /* Remove a node at the end of the doubly linked list */
    public void removeFromRear() {
        //your code
    }

    /* Get a linked list node by index (0-indexed) */
    public Item get(int index) {
        //your code
        return null;
    }


    /* Return the current size of the doubly linked list */
    public int count() {
        //your code
        return 0;
    }

    /* Return an Iterator Object */
    @Override
    public Iterator<Item> iterator() {
        //your code
        return null;
    }

    /* Define the Iterator class, and hasNext() and next() methods */
    public class DoublyLinkedListIterator implements Iterator<Item> {
        //your code

        @Override
        public boolean hasNext() {
            //your code
            return false;
        }

        @Override
        public Item next() {
            //your code
            return null;
        }
    }
    
    /* Get head node (for test purposes) */
    public Node2<Item> getHead() {
    	return head;
    }
    
    /* Get tail node (for test purposes) */
    public Node2<Item> getTail() {
    	return tail;
    }
}
