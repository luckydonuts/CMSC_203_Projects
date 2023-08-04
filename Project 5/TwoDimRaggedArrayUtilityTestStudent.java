import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {

	private double[][]dataOne = {{2,3,3},{4,3,3}};
	private double[][]dataTwo = {{1,2,1},{1,2},{2,4,5}};

	@Test 
	void testGetTotal() {
		assertEquals(18.0, TwoDimRaggedArrayUtility.getTotal(dataOne), .001);
		assertEquals(18.0, TwoDimRaggedArrayUtility.getTotal(dataTwo), .001);

	}

	@Test
	void testGetAverage() {
		assertEquals(3.0 , TwoDimRaggedArrayUtility.getAverage(dataOne), .001);
		assertEquals(2.25 , TwoDimRaggedArrayUtility.getAverage(dataTwo), .001);
	}

	@Test
	void testGetRowTotal() {
		assertEquals(8.0, TwoDimRaggedArrayUtility.getRowTotal(dataOne, 0), .001);
		assertEquals(4.0, TwoDimRaggedArrayUtility.getRowTotal(dataTwo, 0), .001);
	}

	@Test
	void testGetColumnTotal() {
		assertEquals(6.0 , TwoDimRaggedArrayUtility.getColumnTotal(dataOne, 0), .001);
		assertEquals(4.0 , TwoDimRaggedArrayUtility.getColumnTotal(dataTwo, 0), .001);
	}

	@Test
	void testGetHighestInRow() {
		assertEquals(4.0, TwoDimRaggedArrayUtility.getHighestInRow(dataOne, 1), .001);
		assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInRow(dataTwo, 2), .001);
	}

	@Test
	void testGetHighestInRowIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataOne, 1), .001);
		assertEquals(1, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataTwo, 1), .001);
	}

	@Test
	void testGetLowestInRow() {
		assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInRow(dataOne, 0), .001);
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(dataTwo, 0), .001);
	}

	@Test
	void testGetLowestInRowIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataOne, 0), .001);
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataTwo, 0), .001);
	}
	
	@Test
	void testGetHighestInColumn() {
		assertEquals(4.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataOne, 0), .001);
		assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataTwo, 2), .001);
	}

	@Test
	void testGetHighestInColumnIndex() {
		assertEquals(1, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataOne, 0), .001);
		assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataTwo, 2), .001);
	}
	
	@Test
	void testGetLowestInColumn() {
		assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataOne, 0), .001);
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataTwo, 2), .001);
	}
	
	@Test
	void testGetLowestInColumnIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataOne, 0), .001);
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataTwo, 2), .001);
	}
	@Test
	void testGetHighestInArray() {
		assertEquals(4.0, TwoDimRaggedArrayUtility.getHighestInArray(dataOne), .001);
		assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInArray(dataTwo), .001);
	}

	@Test
	void testGetLowestInArray() {
		assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInArray(dataOne), .001);
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataTwo), .001);
	}
}
