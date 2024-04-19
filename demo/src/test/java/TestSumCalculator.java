import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.SumCalculator;

public class TestSumCalculator {
	@Test
	public void testAdd() {
		SumCalculator a = new SumCalculator();
		int result = a.add(2);
		assertEquals(3, result);

		int result2 = a.add(3);
		assertEquals(6, result2);
		
		int result3 = a.add(4);
		assertEquals(10, result3);
		
		int result4 = a.add(10);
		assertEquals(55, result4);
	}
}