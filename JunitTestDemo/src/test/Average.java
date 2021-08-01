package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Average {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Average");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Outside average method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Inside average method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Calculation completed successfully");
	}

	@Test
	public void average() {
		int a=1;
		int b=2;
		int c=3;
		int avg = (a+b+c)/3;
		System.out.println("Average :"+avg);
		assertEquals(2, avg);
	}


}
