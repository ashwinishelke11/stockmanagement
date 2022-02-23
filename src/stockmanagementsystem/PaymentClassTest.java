package stockmanagementsystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PaymentClassTest 
{
	PaymentClass pa = new PaymentClass(1,101,111.1f,"21/02/2022","cash");
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetStock_id() {
		int expected = 1;
		int actual = pa.getStock_id();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetSup_id() {
		int expected = 101;
		int actual = pa.getSup_id();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetAmount() {
		float expected = 111.1f;
		float actual = pa.getAmount();
		assertEquals(expected,actual,0.0001);
	}

	@Test
	public void testGetDate() 
	{
		String expected="21/02/2022";
		String actual= pa.getDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetMode_of_payment() {
		String expected="cash";
		String actual= pa.getMode_of_payment();
		assertEquals(expected,actual);
	}

}
