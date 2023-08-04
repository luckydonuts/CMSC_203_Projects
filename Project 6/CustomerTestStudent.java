import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {

	Customer customer1;
	Customer customer2;

	@BeforeEach
	void setUp() throws Exception {
		customer1 = new Customer("Michael", 24);
		customer2 = new Customer("Bob", 18);

	}

	@AfterEach
	void tearDown() throws Exception {
		customer1 = customer2 = null;
	}

	@Test
	void testGetAge() {
		assertEquals(24, customer1.getAge());
		assertEquals(18, customer2.getAge());
		
	}

	@Test
	void testGetName() {
		assertEquals("Michael", customer1.getName());
		assertEquals("Bob", customer2.getName());
		
	}

	@Test
	void testToString() {
		assertEquals("Michael, 24", customer1.toString());
		assertEquals("Bob, 18", customer2.toString());	
	}

}
