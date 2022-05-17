package ba.edu.ibu.trees;

public class Main {
	
	public static void main(String[] args) {
		demoHeap();
	}
	
	private static void demoHeap() {
	    BinaryHeap<Integer> heap = new BinaryHeap<Integer>();
        
	    heap.insert(4);
	    heap.insert(10);
	    heap.insert(-5);
	    heap.insert(7);
	        
	    System.out.println("current max: " + heap.delMax());
	    System.out.println("current max: " + heap.delMax());
	    System.out.println("current max: " + heap.delMax());
	    System.out.println("heap size: " + heap.size());
	    System.out.println("current max: " + heap.delMax());
	}
}
