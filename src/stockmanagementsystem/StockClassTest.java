package stockmanagementsystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StockClassTest
{
	StockClass st = new StockClass(1,"horlicks","health drink",111.1f);
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetStock_id() 
	{
		int expected = 1;
		int actual = st.getStock_id();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStock_name()
	{
		String expected="horlicks";
		String actual= st.getStock_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStock_type() 
	{
		String expected="health drink";
		String actual= st.getStock_type();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStock_price() 
	{
		float expected = 111.1F;
		float actual = st.getStock_price();
		assertEquals(expected,actual,0.0001);
	}

}
