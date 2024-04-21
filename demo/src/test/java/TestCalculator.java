import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import junit.Calculator;

public class TestCalculator {
	@Test
	public void testAdd() {
		Calculator a = new Calculator();
		int result = a.add(2);
		assertEquals(3, result);

		int result2 = a.add(3);
		assertEquals(6, result2);
		
		int result3 = a.add(4);
		assertEquals(10, result3);
		
		int result4 = a.add(10);
		assertEquals(55, result4);
	}

	@Test
	public void testMultiply(){
		Calculator b = new Calculator();
		int result1 = b.multiply(2);
		assertEquals(2, result1);

		int result2 = b.multiply(3);
		assertEquals(6, result2);

		int result3 = b.multiply(4);
		assertEquals(24, result3);

		int result4 = b.multiply(5);
		assertEquals(120, result4);

		int result5 = b.multiply(0);
		assertEquals(0, result5);

		 // Kiểm tra với số âm
		 assertThrows(IllegalArgumentException.class, () -> {
            b.multiply(-2);
        }, "Số n phải lớn hơn hoặc bằng 0");
	}
}