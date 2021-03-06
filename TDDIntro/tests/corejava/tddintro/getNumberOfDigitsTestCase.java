package corejava.tddintro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class getNumberOfDigitsTestCase {
    private getNumberOfDigits getNumberOfDigits;
    @Before
    public void setUp() throws Exception {
        this.getNumberOfDigits = new getNumberOfDigits();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testWithThreeDigits() {
        int a = 234;
        
        assertEquals(3, getNumberOfDigits.getNumOfDigits(a));
    }
    
    @Test
    public void testWithSevenDigits() {
        int a = 1234567;
        
        assertEquals(7, getNumberOfDigits.getNumOfDigits(a));
    }
    
    public void testWithNegative() {
        int a = -1234567;
        
        assertEquals(7, getNumberOfDigits.getNumOfDigits(a));
    }
}
