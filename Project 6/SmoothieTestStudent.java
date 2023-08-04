import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {

	Smoothie smoothie1;
	Smoothie smoothie2;
	
	@BeforeEach
	void setUp() throws Exception {
		smoothie1 = new Smoothie("Michael", Size.MEDIUM, 0, false);
		smoothie2 = new Smoothie("Bob", Size.MEDIUM, 4, true);

	}

	@AfterEach
	void tearDown() throws Exception {
		smoothie1 = smoothie2 = null;
	}

	@Test
	void testCalcPrice() {
		assertEquals(3.0, smoothie1.calcPrice(), .01);
		assertEquals(6.5, smoothie2.calcPrice(), .01);
	}

	@Test
	void testToString() {	
		assertEquals("Michael, MEDIUM $3.0", smoothie1.toString());
		assertEquals("Bob, MEDIUM Protein, 4 Number of Fruits, $6.5", smoothie2.toString());
	}

	@Test
	void testGetNumOfFruits() {
		assertEquals(0, smoothie1.getNumOfFruits());
		assertEquals(4, smoothie2.getNumOfFruits());
	}

	@Test
	void testGetAddProtein() {
		assertFalse(smoothie1.getAddProtein());
		assertTrue(smoothie2.getAddProtein());	
	}

	@Test
	void testEqualsSmoothie() {	
		assertFalse(smoothie1.equals(smoothie2));
	}

}
