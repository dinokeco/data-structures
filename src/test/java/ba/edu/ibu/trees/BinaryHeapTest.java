package ba.edu.ibu.trees;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class BinaryHeapTest {
    private BinaryHeap<Integer> heap;

    @BeforeEach
    void setUp() throws Exception {
    	heap = new BinaryHeap<Integer>();
    }
 
    @AfterEach
    void tearDown() throws Exception {
    	heap = null;
    }
 
    @Test
    @Order(1)
    void testChecksEmptyHeap() {
        assertTrue(heap.isEmpty());
    }
    
    @Test
    @Order(2)
    void testCorrectlyInsertsToHeap() {
    	heap.insert(1);
    	heap.insert(2);
        assertFalse(heap.isEmpty());
        assertEquals(2, heap.size());
    }
    
    @Test
    @Order(3)
    void testCorrectlyDeletesFromHeap() {
        heap.insert(3);
        heap.insert(5);
        heap.insert(4);
        assertEquals(5, heap.delMax());
    }
    
    @Test
    @Order(4)
    void testCorrectlyInsertsAndDeletes() {
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        assertEquals(3, heap.size());
        
        assertEquals(8, heap.delMax());
        assertEquals(5, heap.delMax());
        assertEquals(3, heap.delMax());
        assertEquals(0, heap.size());
    }

}
