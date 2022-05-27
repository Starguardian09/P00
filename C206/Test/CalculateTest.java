import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Isaac Tan
 * Student ID: 21021646
 * Class: C208-2S4S-W64L
 * Date/Time created: Friday 27-05-2022 11:58
 */

/**
 * @author 21021646
 *
 */
public class CalculateTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
 
	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a =1234;
		int b=8765;
			Calculate cal=new Calculate();
			int actual=cal.add(a,b);
			int expected=9999;
			assertEquals(expected,actual);
	}
	@Test
	public final void testSubtract() {
		int a =1234;
		int b = 8765;
			Calculate cal=new Calculate();
			int actual=cal.subtract(a,b);
			int expected=-7531;
			assertEquals(expected,actual);
	}
	@Test
	public final void testMultiply() {
		int a =1234;
		int b = 8765;
			Calculate cal=new Calculate();
			int actual=cal.multiply(a,b);
			int expected=10816010;
			assertEquals(expected,actual);
	}
	@Test
	public final void testDivide() {
		int a =4;
		int b = 2;
			Calculate cal=new Calculate();
			int actual=cal.divide(a,b);
			int expected=2;
			assertEquals(expected,actual);
	}
}
