import org.junit.Test;
import static org.junit.Assert.*;

public class UpperCaseCounterTest {
    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();
    @Test
    public void getNumberOfUpperCaseCharactersInString() {
        String str = null;
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }

    @Test
    public void emptyCheck(){
        String str = "";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        assertTrue(result == 0);
    }

    @Test
    public void UpperCase(){
        String str = "ABC";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result :: " + result);
        assertTrue(result == 3);
        assertTrue(result ==2);
    }

    public void UpperCase_Check(){
        String str = "ABCdefGHI";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result :: " + result);
        assertTrue(result == 6);
        assertFalse(result == 6);
    }

}