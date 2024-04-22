import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import junit.NextDate;

public class TestNextDate {
    @Test
    public void testNextDate() {
        // Test các trường hợp hợp lệ
        assertEquals("2/1/2020", NextDate.nextDate(1, 1, 2020));
        assertEquals("29/2/2020", NextDate.nextDate(28, 2, 2020));
        assertEquals("1/3/2020", NextDate.nextDate(29, 2, 2020));
        assertEquals("31/12/2020", NextDate.nextDate(30, 12, 2020));
        assertEquals("1/1/2021", NextDate.nextDate(31, 12, 2020));
        
        // Test các trường hợp không hợp lệ
        assertThrows(IllegalArgumentException.class, () -> {
            NextDate.nextDate(0, 1, 2020);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            NextDate.nextDate(32, 1, 2020);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            NextDate.nextDate(29, 2, 2019);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            NextDate.nextDate(31, 11, 2013);
        });
    }
}
