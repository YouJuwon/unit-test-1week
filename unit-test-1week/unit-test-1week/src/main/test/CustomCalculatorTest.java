import org.junit.Test;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    @Test
    public void add() {
        CustomCalculator cal = new CustomCalculator();
        int result = cal.add(3,4);
        assertTrue(result == 7);
    }

    @Test
    public void subtract() {
        CustomCalculator cal = new CustomCalculator();
        int result = cal.subtract(10,2);
        assertTrue(result == 8);
    }

    @Test
    public void multiply() {
    }

    @Test
    public
