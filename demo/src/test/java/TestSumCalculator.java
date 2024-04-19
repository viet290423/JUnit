import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.SumCalculator;

public class TestSumCalculator {
	@Test
	public void testAdd() {
		SumCalculator a = new SumCalculator();
		int result = a.add(2);
		assertEquals(3, result);
	}
}