/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Caesar and Bellaso Encryption and Decryption
 * Due: 10/11/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@Test
	void testIsStringInBounds() {
		assertFalse(CryptoManager.isStringInBounds("THIS SHOULD FAIL SINCE { ISNT VALID"));
		assertTrue(CryptoManager.isStringInBounds("THIS SHOULD PASS IN THEORY"));
	}

	@Test
	void testCaesarEncryption() {
		assertEquals("EXWWHUVFRWFK", CryptoManager.caesarEncryption("BUTTERSCOTCH", 3));
		assertEquals("!^%)", CryptoManager.caesarEncryption("HELP", 89));
	}

	@Test
	void testBellasoEncryption() {
		assertEquals("N^#GJZ", CryptoManager.bellasoEncryption("GOTCHA", "GOODBYE"));
		assertEquals("U\\VNEBB", CryptoManager.bellasoEncryption("CMSC203", "ROCKS"));
	}

	@Test
	void testCaesarDecryption() {
		assertEquals("BUTTERSCOTCH", CryptoManager.caesarDecryption("EXWWHUVFRWFK", 3));
		assertEquals("HELP", CryptoManager.caesarDecryption("!^%)", 89));
	}

	@Test
	void testBellasoDecryption() {
		assertEquals("GOTCHA", CryptoManager.bellasoDecryption("N^#GJZ", "GOODBYE"));
		assertEquals("CMSC203", CryptoManager.bellasoDecryption("U\\VNEBB", "ROCKS"));
	}

}
