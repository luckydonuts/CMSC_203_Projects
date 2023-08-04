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
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		// initialization
		boolean isItInBounds = true;
		// loop that checks each character in plainText
		for (int a = 0; a < plainText.length(); a++) {
			// checks if character is less than LOWER RANGE or greater than UPPER RANGE
			if (plainText.charAt(a) < (int)LOWER_RANGE || plainText.charAt(a) > (int)UPPER_RANGE) 
				isItInBounds = false; 
		} // returns if the string is in bounds or not
		return isItInBounds;
	}
 
	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		// returns message if string is not in bounds
		if (!isStringInBounds(plainText)) 
			return "The selected string is not in bounds, Try again."; 
		// initialization
		String encryptionToCaesar = "";
		int ASCII = 0;
		int length = plainText.length();
		// if string is in bounds, continue
		if (isStringInBounds(plainText)) {
			// loop for encrypting each character of plainText
			for (int a = 0; a < length; a++) {
				// ASCII value equals plainText plus offset key
				ASCII = (int)plainText.charAt(a) + key;
				// wrap around
				while (ASCII > (int)UPPER_RANGE) 
					ASCII -= RANGE; 
				// convert the ASCII values to characters
				encryptionToCaesar += (char)ASCII;
			}
		} // returns encrypted text in Caesar
		return encryptionToCaesar;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		// returns message if string is not in bounds
		if (!isStringInBounds(plainText)) 
			return "The selected string is not in bounds, Try again."; 
		// initialization
		String encryptionToBellaso = "";
		int ASCII = 0;
		int length = plainText.length();
		int bellLength = bellasoStr.length();
		// if string is in bounds, continue
		if (isStringInBounds(plainText)) {
			// loop for encrypting each character of plainText
			for (int a = 0; a < length; a++) {
				// ASCII value equals plainText value plus bellasoStr value
				ASCII = (int)plainText.charAt(a) + (int)bellasoStr.charAt(a % bellLength);
				// wrap around
				while (ASCII > (int)UPPER_RANGE) 
					ASCII -= RANGE;
				// convert the ASCII values to characters
				encryptionToBellaso += (char)ASCII;
			}
		} // returns encrypted text in Bellaso
		return encryptionToBellaso;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		// initialization
		String decryptionOfCaesar = "";
		int ASCII = 0;
		int length = encryptedText.length();
		// loop for decrypting each character of encrypted Caesar text
		for (int a = 0; a < length; a++) {
			// ASCII value equals plainText minus offset key
			ASCII = (int)encryptedText.charAt(a) - key;
			// wrap around	
			while (ASCII < (int)LOWER_RANGE) 
				ASCII += RANGE;
			// convert the ASCII values to characters
			decryptionOfCaesar += (char)ASCII;
		} // returns decrypted Caesar text 
		return decryptionOfCaesar;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		// initialization
		String decryptionOfBellaso = "";
		int ASCII = 0;
		int length = encryptedText.length();
		int bellLength = bellasoStr.length();
		// loop for decrypting each character of encrypted Bellaso text
		for (int a = 0; a < length; a++) {
			// ASCII value equals plainText value minus bellasoStr value
			ASCII = (int)encryptedText.charAt(a) - (int)bellasoStr.charAt(a % bellLength);
			// wrap around	
			while (ASCII < (int)LOWER_RANGE) 
				ASCII += RANGE;
			// convert the ASCII values to characters
			decryptionOfBellaso += (char)ASCII;
		} // returns decrypted Bellaso text
		return decryptionOfBellaso;
	}
}
