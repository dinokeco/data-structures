package ba.edu.ibu.ds.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private Stack<String> stack;
	
	@Before
	public void setup() {
		stack = new ResizingArrayStack<String>();
	}
	@Test
	public void pushTestPositive() {
		stack.push("dino");
		stack.push("keco");
		stack.push("ibu");
		stack.push("burch");
		
		assertEquals("burch", stack.pop());
		assertEquals("ibu", stack.pop());
		assertEquals("keco", stack.pop());
		assertEquals("dino", stack.pop());
	}
	
	@Test
	public void pushTestNegative() {
		stack.push("dino");
		stack.push("keco");
		stack.push("ibu");
		stack.push("burch");
		
		assertEquals(4, stack.count());
		
		assertNotEquals("dino", stack.pop());
		assertNotEquals("keco", stack.pop());
		assertNotEquals("ibu", stack.pop());
		assertNotEquals("burch", stack.pop());
	}
	
	@Test(expected=RuntimeException.class)
	public void emptyStackTest(){
		stack.push("dino");
		stack.pop();
		stack.pop();
	}
	
	@Test
	public void iteratorPositiveTest() {
		stack.push("sarajevo");
		stack.push("kiseljak");
		stack.push("travnik");
		
		assertEquals(3, stack.count());
		
		String[] asserts = {"travnik", "kiseljak", "sarajevo"};
		
		int index = 0;
		for(String item : stack) {
			assertEquals(item, asserts[index]);
			index++;
		}
		
		// iterator doesn't change the state of the stack
		index = 0;
		for(String item : stack) {
			assertEquals(item, asserts[index]);
			index++;
		}
	}
	
	
}
