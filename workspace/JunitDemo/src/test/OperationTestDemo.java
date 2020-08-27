package test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.Operation;

public class OperationTestDemo {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetEmployeeFromDb() {
		//fail("Not yet implemented");
		
		Operation op = Mockito.mock(Operation.class);		// object creation taken care by Mock API
		
		
		when(op.getEmployeeFromDb()).thenReturn("Welcome Mock Testing"); //fake return info
		
		//when(op.getEmployeeFromDb()).thenAnswer("Welcome Mock Testing");
		//when(op.getEmployeeFromDb()).thenCallRealMethod();
		//Operation op = new Operation();
		assertEquals("Welcome Mock Testing", op.getEmployeeFromDb());
	}

}
