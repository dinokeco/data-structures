package ba.edu.ibu.collections;

public class Main {

	public static void main(String[] args) {
		linkedListDemo();
		queueDemo();
	}
	
	private static void queueDemo() {
		System.out.println("Queue demo:");
		Queue<Integer> queue = new Queue<Integer>();
		
	    queue.enqueue(1);
	    queue.enqueue(2);
	    queue.enqueue(3);
	        
	    System.out.println(queue.dequeue());
	    System.out.println(queue.dequeue());
	    System.out.println(queue.dequeue());
	    queue.enqueue(4);
	        
	    System.out.println("queue size: " + queue.size());
		System.out.println("==========================\n");
	}
	
	private static void linkedListDemo() {
		System.out.println("Linked list demo:");
		LinkedList<Integer> list = new LinkedList<Integer>();
        
	    list.addToRear(1);
	    list.addToRear(2);
	    list.addToRear(3);
	    list.addToRear(4);
	    list.addToFront(5);
	    list.addToFront(6);
	     
	    list.removeFromRear();
	    list.removeFromFront();
	 
	    for (Integer i: list) {
	    	System.out.println(i);
	    }
	    
	    System.out.println(list.get(0));
	    System.out.println(list.get(2));
	    System.out.println("list size: " + list.count());
		System.out.println("==========================\n");
	}
}

