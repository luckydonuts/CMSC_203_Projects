import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
	Property propOne;

	@BeforeEach
	void setUp() throws Exception {
		propOne = new Property("Bushman", "Rockville", 3000.00, "Bank of America");
	}

	@AfterEach
	void tearDown() throws Exception {
		propOne = null;
	}

	@Test
	void testGetPropertyName() {
		assertEquals("Bushman", propOne.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(3000, propOne.getRentAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, propOne.getPlot().getX());
		assertEquals(0, propOne.getPlot().getY());
		assertEquals(1, propOne.getPlot().getWidth());
		assertEquals(1, propOne.getPlot().getDepth());
	}

	@Test
	void testToString() {
		assertEquals("Bushman,Rockville,Bank of America,3000.0",propOne.toString());	
	}

}
