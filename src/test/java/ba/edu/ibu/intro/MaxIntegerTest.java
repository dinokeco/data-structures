package ba.edu.ibu.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxIntegerTest {
	static int[] numbers;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		numbers = MaxInteger.readNumbers("/home/aldin-sxr/numbers.txt");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		numbers = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMaxInteger() {
		int maxNumber = MaxInteger.findMax(numbers);
		assertEquals(987, maxNumber);
	}
	
	@Test
	void testMaxIntegerNegative() {
		int maxNumber = MaxInteger.findMax(numbers);
		assertNotEquals(897, maxNumber);
	}

}
