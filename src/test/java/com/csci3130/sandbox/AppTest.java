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
	public void checkMd5Hash() {
		try {
		PasswordHasher ph = new PasswordHasher();
		assertEquals("e9f5bd2bae1c70770ff8c6e6cf2d7b76",
				ph.hash("correcthorsebatterytaple"));
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
