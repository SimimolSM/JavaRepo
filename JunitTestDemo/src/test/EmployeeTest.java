package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class EmployeeTest {

	
		Employee emp1 = new Employee(101, "Simi", 2000);
		Employee emp2 = new Employee(101, "Simi", 2000);

		String srt1= "Simi";
		String str2="Simi";

	@Test
	public void object() {
		assertEquals(emp1,emp2);
		assertSame(emp1,emp2);
	}
	@Test
	public void name() {
		assertEquals(srt1,str2);
		assertSame(srt1,str2);
		
	}

}
