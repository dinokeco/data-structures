package ba.edu.ibu.ds.week1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicTest {
	
	private Basic basic;
	
	@Before
	public void setup() {
		this.basic = new Basic();     
	}
	
	@Test
	public void method1PositiveTest(){	
		String msg = this.basic.method1();
		assertEquals(msg, "This is method 1");
	}

	@Test
	public void method1NegativeTest(){	
		String msg = this.basic.method1();
		assertNotEquals(msg, "This is method 2");
	}
	
	@After
	public void cleanup() {
		this.basic = null;    
	}
}
