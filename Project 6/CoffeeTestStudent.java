import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

	
	Coffee coffee1;
	Coffee coffee2;
	
	@BeforeEach
	void setUp() throws Exception {
		coffee1 = new Coffee("Michael", Size.MEDIUM, false, false);
		coffee2 = new Coffee("Bob", Size.MEDIUM, true, true);
	}

	@AfterEach
	void tearDown() throws Exception {
		coffee1 = coffee2 = null;
	}
	@Test
	void testCalcPrice() {
		assertEquals(3.0, coffee1.calcPrice(), .01);
		assertEquals(4.0, coffee2.calcPrice(), .01);
	}

	@Test
	void testToString() {
		assertEquals("Michael, MEDIUM $3.0", coffee1.toString());
		assertEquals("Bob, MEDIUM Extra Shot, Extra Syrup, $4.0", coffee2.toString());
	}

	@Test
	void testGetExtraShot() {
		assertTrue(coffee2.getExtraShot());

	}

	@Test
	void testGetExtraSyrup() {
		assertFalse(coffee1.getExtraSyrup());
		assertTrue(coffee2.getExtraSyrup());

	}

	@Test
	void testEqualsCoffee() {
		assertFalse(coffee1.equals(coffee2));
	}

}
