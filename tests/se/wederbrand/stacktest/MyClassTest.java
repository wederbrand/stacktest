package se.wederbrand.stacktest;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

	@Test
	public void testConstructor() throws Exception {
		MyClass tested = new MyClass("tested");
		assertEquals("tested", tested.getInput());

	}
}
