import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testSum() throws Exception {
        byte a = 1;
        byte b = 2;
        assertEquals(3, FirstClass.sum(a, b));
    }

    private static class FirstClass {
        public static int sum(byte a, byte b) {
            return a + b;
        }
    }
}