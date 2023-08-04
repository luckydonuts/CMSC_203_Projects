import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SizeTestStudent {
	
	Size sizeS;
	Size sizeM;
	Size sizeL;
	
	@BeforeEach
	void setUp() throws Exception {
		sizeS = Size.SMALL;
		sizeM = Size.MEDIUM;
		sizeL = Size.LARGE;
	}

	@AfterEach
	void tearDown() throws Exception {
		sizeS = sizeM = sizeL = null;
	}

	@Test
	void test() {
		assertTrue(sizeS.toString().compareTo("SMALL") == 0);
		assertTrue(sizeM.toString().compareTo("MEDIUM") == 0);
		assertTrue(sizeL.toString().compareTo("LARGE") == 0);



	}

}
