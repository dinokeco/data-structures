package ba.edu.ibu.collections;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
class QueueTest {
    private Queue<Integer> queue;

    @BeforeEach
    void setUp() throws Exception {
        queue = new Queue<Integer>();
    }
 
    @AfterEach
    void tearDown() throws Exception {
        queue = null;
    }
 
    @Test
    @Order(1)
    void testChecksEmptyQueue() {
        assertTrue(queue.isEmpty());
    }
    
    @Test
    @Order(2)
    void testCorrectlyEnqueuesToQueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        assertFalse(queue.isEmpty());
        assertEquals(2, queue.size());
    }
    
    @Test
    @Order(3)
    void testCorrectlyDequeuesFromQueue() {
        queue.enqueue(3);
        queue.enqueue(4);
        assertEquals(3, queue.dequeue());
    }
    
    @Test
    @Order(4)
    void testCorrectlyEnqueuesAndDequeues() {
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(8);
        assertEquals(3, queue.size());
        
        assertEquals(5, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(8, queue.dequeue());
        assertEquals(0, queue.size());
    }

    @Test
    @Order(5)
    void testDoesNotDequeueFromAnEmptyQueue() {
        assertThrows(IndexOutOfBoundsException.class, () -> queue.dequeue());
    }
}
