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
		App app = new App();
		app.main(null);
		assertEquals("sandbox", App.getRepositoryName());
	}

	@Test
	public void checkSha256Hash() {
		try {
		PasswordHasher ph = new PasswordHasher();
		assertEquals("cbe6beb26479b568e5f15b50217c6c83c0ee051dc4e522b9840d8e291d6aaf46",
				ph.hash("correcthorsebatterystaple"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void checkPasswordHasher() {
		try {
			PasswordHasher ph = new PasswordHasher();
			assertNotEquals("password", ph.hash("password"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
