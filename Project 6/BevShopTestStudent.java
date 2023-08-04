import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {

	BevShop bev1;
	BevShop bev2;
	
	@BeforeEach
	void setUp() throws Exception {
		bev1 = new BevShop();
		bev2 = new BevShop();
	}

	@AfterEach
	void tearDown() throws Exception {
		bev1 = bev2 = null;
	}

	@Test
	void testIsValidTime() {
		assertFalse(bev1.isValidTime(7));
		assertTrue(bev1.isValidTime(9));
	}

	@Test
	void testGetMaxNumOfFruits() {
		assertEquals(5, bev1.getMaxNumOfFruits());
	}

	@Test
	void testGetMinAgeForAlcohol() {
		assertEquals(21, bev1.getMinAgeForAlcohol());
	}

	@Test
	void testIsMaxFruit() {
		assertTrue(bev1.isMaxFruit(5));
		assertFalse(bev1.isMaxFruit(3));
	}

	@Test
	void testGetMaxOrderForAlcohol() {
		assertEquals(3, bev1.getMaxOrderForAlcohol());
	}

	@Test
	void testIsEligibleForMore() {
		assertTrue(bev1.isEligibleForMore());
	}

	@Test
	void testGetNumOfAlcoholDrink() {
		assertEquals(0, bev1.getNumOfAlcoholDrink());
	}

	@Test
	void testIsValidAge() {
		assertTrue(bev1.isValidAge(21));
		assertFalse(bev2.isValidAge(16));
	}
}
