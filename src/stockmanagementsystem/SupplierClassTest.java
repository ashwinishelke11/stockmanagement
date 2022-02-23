package stockmanagementsystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SupplierClassTest
{
	SupplierClass su = new  SupplierClass(1,"ashwini",1234567890,"ashu96@gmail.com","Bangalore");
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSup_id() 
	{
		int expected = 1;
		int actual = su.getSup_id();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetSup_name() 
	{
		String expected="ashwini";
		String actual= su.getSup_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_num()
	{

		int expected = 1234567890;
		int actual = su.getContact_num();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail_id() 
	{
		String expected="ashu96@gmail.com";
		String actual= su.getEmail_id();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPlace()
	{
		String expected="Bangalore";
		String actual= su.getPlace();
		assertEquals(expected,actual);
	}

}
