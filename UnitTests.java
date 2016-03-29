import org.junit.Test;

import junit.framework.TestCase;


public class UnitTests extends TestCase {
	
	@Test
	public void testNormal() {
		String actual = Driver.concatIntegerListToLargestInt(new int[]{23, 8, 45, 123 });
		String exp = new String("84523123");
		assertTrue(exp.equals(actual));
	}
	
	@Test
	public void testWithOneInt()
	{
		String actual = Driver.concatIntegerListToLargestInt(new int[] {1});
		String exp = new String("1");
		assertTrue(exp.equals(actual));
	}
	
	@Test
	public void testWithTwoInts()
	{
		String actual = Driver.concatIntegerListToLargestInt(new int[] {89, 9});
		String exp = new String("989");
		assertTrue(exp.equals(actual));
	}
	
	@Test
	public void testWithTie()
	{
		String actual = Driver.concatIntegerListToLargestInt(new int[] {100, 8, 100});
		String exp = new String("8100100");
		assertTrue(exp.equals(actual));
	}
	
	pub

}
