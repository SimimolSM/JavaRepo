package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AreaofSquare {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int a=4;
		int area=a*a;
		System.out.println("Area :"+area);
		assertEquals(16, +area);
	}

}
