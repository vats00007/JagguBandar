package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase1 {

	@Test
	public void test() {
		String actual = "Hello";
		String expected = "Hello";
		assertEquals(actual, expected);
	}

}
