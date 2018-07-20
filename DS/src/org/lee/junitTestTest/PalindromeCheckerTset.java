package org.lee.junitTestTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.lee.junitTest.PalindromeChecker;

class PalindromeCheckerTset {

	@Test
	void testCreatePalindromeCheckerTestObject(String s) {
		PalindromeChecker obj = new PalindromeChecker();
		assertNotNull(obj);
		
	}

}
