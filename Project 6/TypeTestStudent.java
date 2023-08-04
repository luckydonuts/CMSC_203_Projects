import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TypeTestStudent {
	
	Type typeA;
	Type typeS;
	Type typeC;

	@BeforeEach
	void setUp() throws Exception {
		typeA = Type.ALCOHOL;
		typeS = Type.SMOOTHIE;
		typeC = Type.COFFEE;
	}

	@AfterEach
	void tearDown() throws Exception {
		typeA = typeS = typeC = null;
	}

	@Test
	void test() {
		assertTrue(typeA.toString().compareTo("ALCOHOL") == 0);
		assertTrue(typeS.toString().compareTo("SMOOTHIE") == 0);
		assertTrue(typeC.toString().compareTo("COFFEE") == 0);
	}

}
