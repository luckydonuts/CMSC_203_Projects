import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DayTestStudent {
	Day monday;
	Day sunday;
	
	@BeforeEach
	void setUp() throws Exception {
		monday = Day.MONDAY;
		sunday = Day.SUNDAY;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertTrue(monday.toString().compareTo("MONDAY") == 0);
		assertTrue(sunday.toString().compareTo("SUNDAY") == 0);

	}

}
