package ba.edu.ibu.collections;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class StackTest {
	private Stack<Integer> stack;

	@BeforeEach
	void setUp() throws Exception {
		stack = new Stack<Integer>();
	}

	@AfterEach
	void tearDown() throws Exception {
		stack = null;
	}

    @Test
    @Order(1)
    void testChecksEmptyStack() {
        assertTrue(stack.isEmpty());
    }
    
    @Test
    @Order(2)
    void testCorrectlyPushesToStack() {
        stack.push(1);
        stack.push(2);
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.size());
    }
    
    @Test
    @Order(3)
    void testCorrectlyPopsFromStack() {
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.pop());
    }
    
    @Test
    @Order(4)
    void testCorrectlyPopsAndPushes() {
        stack.push(5);
        stack.push(3);
        stack.push(8);
        assertEquals(3, stack.size());
        
        assertEquals(8, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(5, stack.pop());
        assertEquals(0, stack.size());
    }
    
    @Test
    @Order(5)
    void testDoesNotPopFromEmptyStack() {
        assertThrows(IndexOutOfBoundsException.class, () -> stack.pop());
    }

}
