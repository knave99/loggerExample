package net.cloudshaped.LoggerTest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigourous Test :-)
	 */
	
	@Test
	public void testApp() {
		String[] in = { "Hello - test input here!", "item 2", "item 3" };
		App app = new App(in);
		Assert.assertTrue(app.writeOut() != null);
	}
}
