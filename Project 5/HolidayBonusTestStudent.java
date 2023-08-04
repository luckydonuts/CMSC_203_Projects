import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {

	private double[][] dataOne = {{ 3, 4, 3 }, { 1, 3 }, { 4, 10, 9}, {3,2}};
	private double[][] dataTwo = {{2, 3, 2}, {1, 2, 4}, {1, 3}};

	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] resultOne = HolidayBonus.calculateHolidayBonus(dataOne);
			double[] resultTwo = HolidayBonus.calculateHolidayBonus(dataTwo);

			assertEquals(5000.0, resultOne[0], .001);
			assertEquals(3000.0, resultOne[1], .001);
			assertEquals(15000.0, resultOne[2], .001);
			assertEquals(11000.0, resultTwo[0], .001);
			assertEquals(7000.0, resultTwo[1], .001);
			assertEquals(6000.0, resultTwo[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}

	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(26000.0, HolidayBonus.calculateTotalHolidayBonus(dataOne), .001);
		assertEquals(24000.0, HolidayBonus.calculateTotalHolidayBonus(dataTwo), .001);
	}


}
