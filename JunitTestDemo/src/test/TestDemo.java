package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDemo {

	@Test
	public  void largest() {
		System.out.println("Find largest number");
		assertEquals(5, Largest.large(1, 3, 5));
	}

	@Test
	public void concat() {
		System.out.println("Concatination of two strings");
		assertEquals("JavaTraining", StringConcat.stringConact("Java", "Training"));

	}

	@Test
	public void factorial() {
		System.out.println("Factorial of a number");
		assertEquals(6, Factorial.factorial(3));

	}
	@Test
	public void palindrome() {
		System.out.println("Palindrome");
		assertEquals("malayalam", Palindrome.palindrome("malayalam"));
	}
	@Test
	public void method() {
		System.out.println("Positive or Negative Number");
		assertTrue(PositiveOrNegative.check(9));
		assertFalse(PositiveOrNegative.check(-5));
	}
	@Test
	public void perfectSquare() {
		assertTrue("Perfect Square", PerfectSquare.square(16));
		assertFalse("Not a perfect square", PerfectSquare.square(15));
		
	}

}
