package programminghub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MulTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(30, 20);
        assertEquals(600, result);
    }
}
