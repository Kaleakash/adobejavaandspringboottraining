package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Operation;

public class OperationTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before all test");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After all test");
	}
	@Before
	public void before() {
		System.out.println("Before Every Test");
	}
	
	@Test			// main method for unit testing 
	public void testAdd() {
		//fail("Not yet implemented");
		System.out.println("While testing in add method");
		Operation op1 = new Operation();
		int result = op1.add(100, 200);
		assertEquals(300, result);
		int result1 = op1.add(101, 201);
		assertEquals(300, result1);
	}

	@Test
	public void testGetInfo() {
		System.out.println("While testing in getInfo method");
		Operation op = new Operation();
		List<String> listOfStd = op.getInfo();
		assertEquals(3, listOfStd.size());
		assertEquals("ravi", listOfStd.get(0));
		
		
	}
	
	@After
	public void after() {
		System.out.println("After Every Test");
	}
	
	
}
