import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
	private Plot plotOne, plotTwo, plotThree, plotFour;
	
	@BeforeEach
	void setUp() throws Exception {
		plotOne = new Plot(3,4,3,4);
		plotTwo = new Plot(4,5,4,4);
		plotThree = new Plot(1,4,2,1);
		plotFour = new Plot(1,3,3,4);
	}

	@Test
	void testOverlaps() {
		assertTrue(plotOne.overlaps(plotTwo));
		assertTrue(plotTwo.overlaps(plotOne));
	}

	@Test
	void testEncompasses() {
		assertTrue(plotOne.encompasses(plotFour));
		assertTrue(plotFour.encompasses(plotOne));
	}
	@Test
	public void testToString() {
		assertEquals("1,4,2,1",plotThree.toString());	
	}

}
