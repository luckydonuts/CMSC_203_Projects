import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTestStudent {

	Order order1, order2;
	@BeforeEach
	void setUp() throws Exception {
		order1 = new Order(10, Day.MONDAY, new Customer("Michael", 18));
		order2 = new Order(18, Day.SATURDAY, new Customer("Bob", 23));
	}

	@AfterEach
	void tearDown() throws Exception {
		order1 = order2 = null;
	}


	@Test
	void testGetOrderTime() {
		assertEquals(10, order1.getOrderTime());
		assertEquals(18, order2.getOrderTime());
	}

	@Test
	void testGetOrderDay() {
		assertEquals(Day.MONDAY, order1.getOrderDay());
		assertEquals(Day.SATURDAY, order2.getOrderDay());

	}

	@Test
	void testGetDay() {
		assertEquals(Day.MONDAY, order1.getOrderDay());
		assertEquals(Day.SATURDAY, order2.getOrderDay());
	}

	@Test
	void testIsWeekend() {
		assertEquals(false, order1.isWeekend());
		assertEquals(true, order2.isWeekend());

	}

	@Test
	public void testGetBeverage() {
		Coffee coffee = new Coffee("Large Coffee", Size.LARGE, false, false);
		Alcohol alcohol = new Alcohol("Screwdriver", Size.MEDIUM, false);

		order1.addNewBeverage("Large Coffee", Size.LARGE, false, false);
		order1.addNewBeverage("Screwdriver", Size.MEDIUM);
		assertTrue(order1.getBeverage(0).equals(coffee));
		assertTrue(order1.getBeverage(1).equals(alcohol));
	}

	@Test
	public void testAddNewBeverage() throws NullPointerException {

		assertTrue(order1.getTotalItems() == 0);
		order1.addNewBeverage("Large Coffee", Size.LARGE, false, false);
		assertTrue(order1.getBeverage(0).getType().equals(Type.COFFEE));
		order1.addNewBeverage("Screwdriver", Size.SMALL);
		assertTrue(order1.getBeverage(1).getType().equals(Type.ALCOHOL));
		order1.addNewBeverage("Strawberry", Size.MEDIUM, 1, false);
		assertTrue(order1.getBeverage(2).getType().equals(Type.SMOOTHIE));
		assertTrue(order1.getTotalItems() == 3);
	}

	@Test
	public void testCalcOrderTotal() {
		order1.addNewBeverage("Large Coffee", Size.SMALL, false, false);
		order1.addNewBeverage("Screwdriver", Size.SMALL);
		order1.addNewBeverage("Strawberry", Size.MEDIUM, 1, false);

		assertEquals(7.5, order1.calcOrderTotal(), .01);

		order2.addNewBeverage("small Coffee", Size.SMALL, true, false);
		order2.addNewBeverage("small screwdriver", Size.SMALL);
		order2.addNewBeverage("cherry", Size.SMALL, 0, true);

		assertEquals(8.6, order2.calcOrderTotal(), .01);

	}

	@Test
	void testCompareTo() {
		assertFalse(order1.equals(order2));
	}
}
