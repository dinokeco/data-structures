package ba.edu.ibu.collections;

/**
 * Queue implementation (using linked lists).
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class Queue<Item> {
    private Node<Item> head = null;
    private Node<Item> tail = null;
	private int size = 0;
    
    /* Return the current size of the queue */
    public int size() {
        return size;
    }

    /* Check if the queue is empty */
    public boolean isEmpty() {
        return size == 0;
    }

    /* Add new item to the back of the queue */
    public void enqueue(Item item) {
        Node<Item> newNode = new Node<Item>();	// 1
        newNode.data = item;					// 1
        if (isEmpty()) {						// 2
            head = tail = newNode;				// 2
        } else {										
            tail.next = newNode;				// 3
            tail = newNode;						// 4
        }
        size++;									// 5
    }

    /* Removes an item from the front of the queue, and returns its data */
    public Item dequeue() throws IndexOutOfBoundsException {
        if (isEmpty()) {												// 1
            throw new IndexOutOfBoundsException("Queue is empty!");		// 1
        }
        
        Item data = head.data;											// 2
        head = head.next;												// 3
        size--;															// 4
        
        if (isEmpty()) {											    // 5
        	tail = null;												// 5
        }
        
        return data;													// 6
    }

}
