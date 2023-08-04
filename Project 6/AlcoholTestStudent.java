import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {
	Alcohol alcohol;
	Alcohol alcohol2;

	
	@BeforeEach
	void setUp() throws Exception {
		alcohol = new Alcohol("Michael", Size.MEDIUM, true);
	    alcohol2 = new Alcohol ("Bob", Size.MEDIUM, false);
	}

	@AfterEach
	void tearDown() throws Exception {
		alcohol = alcohol2 = null;
	}

	@Test
	void testCalcPrice() {
		assertEquals(3.6, alcohol.calcPrice(), .01);
		assertEquals(3.0, alcohol2.calcPrice(), .01);
	}

	@Test
	void testToString() {
		assertEquals("Michael, MEDIUM Weekend, $3.6", alcohol.toString());
		assertEquals("Bob, MEDIUM Weekday, $3.0", alcohol2.toString());

	}

	@Test
	void testEqualsAlcohol() {
		assertFalse(alcohol.equals(alcohol2));
	}

	@Test
	void testIsWeekend() {
		assertTrue(alcohol.isWeekend());
		assertFalse(alcohol2.isWeekend());
	}

}
