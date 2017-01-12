package com.csci3130.sandbox;

/*
 * static imports allow us to call assertTrue() instead of
 * calling Assert.assertTrue() and makes the code easier to
 * read and write.
 */
import static org.junit.Assert.*; 
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigourous Test
	 */
	@Test
	public void testApp() {
		assertTrue(true);
	}

	@Test
	public void testRepository() {
		assertEquals("sandbox", App.getRepositoryName());
	}
}
